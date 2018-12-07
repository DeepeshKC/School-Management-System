package com.deepesh.schoolmanagement.app.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deepesh.schoolmanagement.app.model.Teacher;
//import com.deepesh.schoolmanagement.app.repository.TeacherRepository;

	@Controller
	public class TeacherController {
//		@Autowired private TeacherRepository teacherRepository;

	@ModelAttribute("teacher") 
	public Teacher getTeacher() {
		return new Teacher();
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loadDashboard() {
		return "teacherdashboard";
	}
	
	@RequestMapping(value="teacherForm", method=RequestMethod.GET)
	public String loadTeacher() {
		return "addTeacher";
	}
	
	
}
