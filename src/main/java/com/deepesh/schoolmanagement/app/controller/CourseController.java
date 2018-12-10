package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.deepesh.schoolmanagement.app.model.Course;

@Controller
public class CourseController {
	@ModelAttribute("course")

	public Course getCourse() {
		return new Course();
	}

}
