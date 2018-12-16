package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.deepesh.schoolmanagement.app.model.QuestionPaper;

@Controller
public class TestPaperController {
	@ModelAttribute("testPaper")

	public QuestionPaper getTestPaper() {
		return new QuestionPaper();
	}
}
