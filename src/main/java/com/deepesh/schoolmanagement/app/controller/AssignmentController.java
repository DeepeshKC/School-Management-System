package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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

	@RequestMapping(value = "/uploadAssignment", method= RequestMethod.POST) // //new annotation since 4.3
	
	public String singleFileUpload( @RequestParam("file")MultipartFile file,
                                   RedirectAttributes redirectAttributes) throws IOException {
		
		Path directoryPath =  Paths.get("","assignments").toAbsolutePath();
		if(!Files.exists(directoryPath)) {
			Files.createDirectory(directoryPath);
		}
		String UPLOADED_FOLDER = directoryPath.toString();
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:/teacher/addAssignments";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path  path = Paths.get(UPLOADED_FOLDER , file.getOriginalFilename());
            Files.write(path, bytes);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/teacher/addAssignments";
    }
	
	
	
	@RequestMapping(value = "**/teacher/addAssignments", method = RequestMethod.GET)
	public String loadAddAssignments(@RequestParam("class_id")Long class_id, @RequestParam("teacher_id")Long teacher_id, Model model, Model model1) {
	     model.addAttribute("classes", class_id);
	     model.addAttribute("teacher", teacher_id);
		return "teacherAddAssignment";
	}

	@RequestMapping(value = "**/teacher/add-addAssignments", method = RequestMethod.POST)
	public String addAssignments(@ModelAttribute("assignment") Assignment assignment) {
		assignmentRepository.save(assignment);
		return "redirect:teacher/viewAssignments";

	}

	@RequestMapping(value = "**/teacher/viewAssignments", method = RequestMethod.GET)
	public String viewAssignments(Model model) {
		model.addAttribute("assignmentList", assignmentRepository.findAll());
		return "teacherViewAssignment";
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
