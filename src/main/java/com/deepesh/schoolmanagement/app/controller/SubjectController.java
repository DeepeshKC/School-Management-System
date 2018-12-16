package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Classes;
import com.deepesh.schoolmanagement.app.model.Subject;
import com.deepesh.schoolmanagement.app.repository.SubjectRepository;

@Controller
public class SubjectController {
	@Autowired
	private SubjectRepository subjectRepository;

	@ModelAttribute("subject")
	public Subject getSubject() {
		return new Subject();
	}

	@RequestMapping(value = "/addSubjects", method = RequestMethod.GET)
	public String loadAddSubjectForm() {
		return "addSubject";
	}

	@RequestMapping(value = "add-addSubject", method = RequestMethod.POST)
	public String addTeacher(@ModelAttribute("subject") Subject subject) {
		Classes c = new Classes();
		c.setClassId(1);
		subject.setClasses(c);
		subjectRepository.save(subject);
		return "redirect:/viewSubjects";
	}

	@RequestMapping(value = "viewSubjects", method = RequestMethod.GET)
	public String loadViewSubject(Model model) {
		model.addAttribute("subjectList", subjectRepository.findAll());
		return "viewSubject";
	}

	@RequestMapping(value = "delete-deleteSubject", method = RequestMethod.GET)
	public String deleteSubject(@RequestParam("id") Long id) {
		subjectRepository.deleteById(id);
		return "redirect:/viewSubjects";
	}
}
