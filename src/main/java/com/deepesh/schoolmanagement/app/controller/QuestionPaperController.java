package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Classes;
import com.deepesh.schoolmanagement.app.model.QuestionPaper;
import com.deepesh.schoolmanagement.app.repository.QuestionPaperRepository;

@Controller
public class QuestionPaperController {
	@Autowired
	private QuestionPaperRepository questionRepository;

	@ModelAttribute("questionPaper")
	public QuestionPaper questionpaper() {
		return new QuestionPaper();
	}

	@RequestMapping(value = "**/teacher/addQuestionPapers", method = RequestMethod.GET)
	public String loadAddQuestionPage() {
		return "teacherAddQuestionPaper";
	}

	@RequestMapping(value = "add-addQuestion", method = RequestMethod.POST)
	public String addQuestion(@ModelAttribute("questionPaper") QuestionPaper questionPaper) {
		Classes c = new Classes();
		//c.setClassId(1);
		questionPaper.setClasses1(c);
		questionRepository.save(questionPaper);
		return "redirect:/viewQuestionPapers";
	}

	@RequestMapping(value = "**/teacher/viewQuestionPapers", method = RequestMethod.GET)
	public String viewQuestion(Model model) {
		model.addAttribute("questionPaperList", questionRepository.findAll());
		return "teacherViewQuestionPaper";
	}
	
	@RequestMapping(value = "/viewQuestionPapers", method = RequestMethod.GET)
	public String ad_viewQuestion(Model model) {
		model.addAttribute("questionPaperList", questionRepository.findAll());
		return "viewQuestionPaper";
	}
	

	@RequestMapping(value = "delete-deleteQuestionPaper", method = RequestMethod.POST)
	public String deleteQuestion(@RequestParam("id") Long id, Model model) {
		questionRepository.deleteById(id);
		return "redirect:/viewQuestionPaper";
	}
}
