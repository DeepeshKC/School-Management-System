package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deepesh.schoolmanagement.app.model.Classes;

@Controller
public class ClassesController {

	@ModelAttribute("classes") 
	public Classes getClasses() {
		return new Classes();
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loadDashboard() {
		return "classesdashboard";
	}
	
	@RequestMapping(value="classesForm", method=RequestMethod.GET)
	public String loadClasses() {
		return "addClasses";
	}
}
