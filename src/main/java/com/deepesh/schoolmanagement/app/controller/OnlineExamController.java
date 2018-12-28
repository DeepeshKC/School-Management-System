package com.deepesh.schoolmanagement.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deepesh.schoolmanagement.app.model.Answers;
import com.deepesh.schoolmanagement.app.model.OnlineExam;
import com.deepesh.schoolmanagement.app.model.QuestionPaper;
import com.deepesh.schoolmanagement.app.repository.OnlineExamRepository;
import com.deepesh.schoolmanagement.app.repository.QuestionPaperRepository;

@Controller
public class OnlineExamController {

	@Autowired private OnlineExamRepository onlineRepository;
	@Autowired private QuestionPaperRepository qp;

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

	@RequestMapping(value = "**/onlineExams1", method = RequestMethod.GET)
	public String onlineExam(Model model) {
		model.addAttribute("onlineExamList", qp.findAll());
		return "onlineExam1";
	}
	
	@RequestMapping(value = "**/online-Exam1", method = RequestMethod.GET)
	public String onlineExam1(Model model) {
		model.addAttribute("onlineExamList", qp.findAll());
		return "onlineExam1";
	}
	

	@RequestMapping(value = "viewResult", method = RequestMethod.POST)
	public String viewResult(@ModelAttribute("answers") Answers answers, RedirectAttributes ra) {
		
		Map<String, List<String>> mapResult = new HashMap<String, List<String>>();
		
		int totalScore = 0;
		
		for (int i = 0; i < answers.answers.size(); i++) {
			List<String> result = new ArrayList<>();
			String res = "Wrong";
			if (answers.answers.get(i).equals(answers.rightAnswer.get(i))) {
				res = "Correct";
				totalScore+=10;
			}
			
			result.add(res);
			result.add(answers.answers.get(i));
			result.add(answers.rightAnswer.get(i));
			
			mapResult.put("res" + i, result);
		}
		
		ra.addFlashAttribute("result", mapResult);
		ra.addFlashAttribute("score", totalScore);
		
//		List<String> item = mapResult.get("res0");
//		for (int i = 0; i < 10; i++) {
//			System.out.println(mapResult.get("res" + i).get(0));
//			System.out.println(mapResult.get("res" + i).get(1));
//			System.out.println(mapResult.get("res" + i).get(2));
//			System.out.println("...................................");;
//		}
//		
		return "redirect:/online-Exam1";
	}
}
