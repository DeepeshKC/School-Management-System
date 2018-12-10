package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.deepesh.schoolmanagement.app.model.Parents;

@Controller
public class ParentController {
	@ModelAttribute("parents")

	public Parents getParents() {
		return new Parents();
	}
}