package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.deepesh.schoolmanagement.app.model.Assignment;

@Controller
public class AssignmentController {
	@ModelAttribute("assignment")

	public Assignment getAssignment() {
		return new Assignment();
	}

}
