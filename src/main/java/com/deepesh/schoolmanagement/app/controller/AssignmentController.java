package com.deepesh.schoolmanagement.app.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.deepesh.schoolmanagement.app.model.Assignment;
import com.deepesh.schoolmanagement.app.repository.AssignmentRepository;

@Controller
public class AssignmentController {
	@Autowired
	private AssignmentRepository assignmentRepository;

	@ModelAttribute("assignment")
	public Assignment getAssignment() {
		return new Assignment();
	}

	public String fileUpload(@RequestParam("file") MultipartFile file) {
		String update = "";

		Path directoryPath = Paths.get("assignments");
		if (!Files.exists(directoryPath)) {
			try {
				Files.createDirectory(directoryPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String UPLOADED_FOLDER = directoryPath.toString();
		if (file.isEmpty()) {
			update = "0";
			return update;
		}

		try {
			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER, file.getOriginalFilename());
			Files.write(path, bytes);

			update = path.toString();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return update;
	}

	@RequestMapping(value = "**/teacher/addAssignments", method = RequestMethod.GET)
	public String loadAddAssignments(@RequestParam("class_id") Long class_id,
			@RequestParam("teacher_id") Long teacher_id, Model model, Model model1) {
		model.addAttribute("classes", class_id);
		model.addAttribute("teacher", teacher_id);
		return "teacherAddAssignment";
	}

	@RequestMapping(value = "**/teacher/add-addAssignments", method = RequestMethod.POST)
	public String addAssignments(@ModelAttribute("assignment") Assignment assignment,
			@RequestParam("file") MultipartFile file) {
		String fileName = fileUpload(file);
		assignment.setAssignmentFile(!fileName.equals("0") ? fileName : null);
		assignmentRepository.save(assignment);
		return "redirect:teacher/viewAssignments";

	}

	@RequestMapping(value = "**/teacher/viewAssignments", method = RequestMethod.GET)
	public String viewAssignments(Model model) {
		model.addAttribute("assignmentList", assignmentRepository.findAll());
		return "teacherViewAssignment";
	}

	@GetMapping(value = "downloadAssignment", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public byte[] download(@RequestParam("link") String link) {

		try {
			if (Files.exists(Paths.get(link))) {
				InputStream in = Files.newInputStream(Paths.get(link));
				return IOUtils.toByteArray(in);
			}
		} catch (IOException io) {
			io.getMessage();
		}
		return null;
	}

	@RequestMapping(value = "**/student/viewAssignments", method = RequestMethod.GET)
	public String studentViewAssignments(Model model) {
		model.addAttribute("assignmentList", assignmentRepository.findAll());
		return "studentViewAssignment";
	}

	@RequestMapping(value = "/viewAssignments", method = RequestMethod.GET)
	public String ad_iewAssignments(Model model) {
		model.addAttribute("assignmentList", assignmentRepository.findAll());
		return "viewAssignment";
	}

	@RequestMapping(value = "delete-deleteAssignment", method = RequestMethod.GET)
	public String deleteAssignment(@RequestParam("id") Long id) {
		assignmentRepository.deleteById(id);
		return "redirect:/viewAssignments";
	}
}
