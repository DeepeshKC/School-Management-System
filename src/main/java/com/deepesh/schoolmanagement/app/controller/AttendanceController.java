package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deepesh.schoolmanagement.app.model.Attendance;

@Controller
public class AttendanceController {

	@ModelAttribute("attendance")
	public Attendance attendance() {
		return new Attendance();
	}
	
	@RequestMapping(value = "/addAttendances", method = RequestMethod.GET)
	public String loadAttendanceForm() {
		return "addAttendance";
	}
}
