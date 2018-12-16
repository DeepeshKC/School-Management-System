package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deepesh.schoolmanagement.app.model.OnlineExam;
import com.deepesh.schoolmanagement.app.repository.OnlineExamRepository;

@Controller
public class OnlineExamController {

	@Autowired private OnlineExamRepository onlineRepository;

	@ModelAttribute("onlineExam")
	public OnlineExam onlineExam() {
		return new OnlineExam();
	}

	@RequestMapping(value = "/addOnlineExams", method = RequestMethod.GET)
	public String loadOnlineexam() {
		return "addOnlineExam";
	}

	@RequestMapping(value = "add-addOnlineExam", method = RequestMethod.POST)
	public String addOnlineExam(@ModelAttribute("onlineExam") OnlineExam onlineExam) {
		onlineRepository.save(onlineExam);
		return "redirect:/online-Exam";
	}

	@RequestMapping(value = "online-Exam", method = RequestMethod.GET)
	public String onlineExam(Model model) {
		model.addAttribute("onlineExamList", onlineRepository.findAll());
		return "onlineExam";
	}
	
	@RequestMapping(value = "online-Exam1", method = RequestMethod.GET)
	public String onlineExam1(Model model) {
//		model.addAttribute("onlineExamList", onlineRepository.findAll());
		return "onlineExam1";
	}
}
