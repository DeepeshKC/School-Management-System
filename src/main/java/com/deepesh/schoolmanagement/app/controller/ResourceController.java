package com.deepesh.schoolmanagement.app.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.deepesh.schoolmanagement.app.model.Assignment;
import com.deepesh.schoolmanagement.app.model.Resource;
import com.deepesh.schoolmanagement.app.repository.ResourceRepository;

@Controller
public class ResourceController {
	@Autowired
	private ResourceRepository resourceRepository;

	@ModelAttribute("resource")
	public Resource getResources() {
		return new Resource();
	}

	public String fileUpload(@RequestParam("file") MultipartFile file) {
		String update = "";

		Path directoryPath = Paths.get("resources");
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

	@RequestMapping(value = "**/teacher/addResource", method = RequestMethod.GET)
	public String loadAddAssignments(@RequestParam("teacher_id") Long teacher_id, Model model, Model model1) {
		
		model.addAttribute("teacher", teacher_id);
		return "teacherAddResource";
	}
	
	@RequestMapping(value = "**/teacher/add-addResource", method = RequestMethod.POST)
	public String addAssignments(@ModelAttribute("resource") Resource resource,
			@RequestParam("file") MultipartFile file) {
		String fileName = fileUpload(file);
		resource.setResource(!fileName.equals("0") ? fileName : null);
		resourceRepository.save(resource);
		return "redirect:teacher/viewResources";
	}
		@RequestMapping(value = "**/teacher/viewResources", method = RequestMethod.GET)
		public String ad_iewAssignments(Model model) {
			model.addAttribute("resourceList", resourceRepository.findAll());
			return "teacherViewResource";
		}
		@RequestMapping(value = "**/student/viewResources", method = RequestMethod.GET)
		public String sd_iewAssignments(@RequestParam("id")Long  id,Model model) {
			model.addAttribute("resourceList", resourceRepository.findByTeacherId(id));
			return "studentViewResource";
		}

	
	@GetMapping(value = "downloadResource", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
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
}
