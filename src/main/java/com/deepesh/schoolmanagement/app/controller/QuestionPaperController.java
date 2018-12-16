package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deepesh.schoolmanagement.app.model.QuestionPaper;

@Controller
public class QuestionPaperController {

	public QuestionPaper questionpaper() {
		return new QuestionPaper();
	}

	@RequestMapping(value = "/addQuestions", method = RequestMethod.GET)
	public String loadAddQuestionPage() {
		return "addQuestionPaper";
	}

	@RequestMapping(value = "add-addQuestion", method = RequestMethod.POST)
	public String addQuestion(@ModelAttribute("questionPaper") QuestionPaper questionPaper) {
		return "redirect:/viewQuestionPaper";
	}
}
