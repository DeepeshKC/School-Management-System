package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.deepesh.schoolmanagement.app.model.Intake;

@Controller
public class IntakeController {
	@ModelAttribute("intake")

	public Intake getIntake() {
		return new Intake();
	}
}
