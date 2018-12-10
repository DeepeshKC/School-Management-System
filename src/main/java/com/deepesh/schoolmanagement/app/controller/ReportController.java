package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.deepesh.schoolmanagement.app.model.Report;

@Controller
public class ReportController {
	@ModelAttribute("report")
	
	public Report getReport() {
		return new Report();
	}

}
