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
import com.deepesh.schoolmanagement.app.model.SubjectClass;
import com.deepesh.schoolmanagement.app.repository.SubjectClassRepository;
import com.deepesh.schoolmanagement.app.repository.SubjectRepository;

@Controller
public class SubjectClassController {
	@Autowired
	private SubjectClassRepository subjectClassRepository;
	@Autowired
	private SubjectRepository subjectRepository;

	@ModelAttribute("subjectClass")
	public SubjectClass getSubjectClass() {
		return new SubjectClass();
	}

	@RequestMapping(value = "/addSubject", method = RequestMethod.GET)
	public String loadSubjectList(@RequestParam("id") Long id, Model model1, Model model2) {
		Classes clas = new Classes();
		clas.setClassId(id);
		model1.addAttribute("classes", clas);
		model2.addAttribute("subjectList", subjectRepository.findAll());
		return "addSubjectClass";
	}

	@RequestMapping(value = "/addSubjectClass",method={ RequestMethod.POST, RequestMethod.GET })
	public String addSubjectToClass(@RequestParam("id") Long id, @RequestParam("class_id") Long class_id) {
		Subject subject = new Subject();
		subject.setSubjectId(id);
		Classes clas = new Classes();
		clas.setClassId(class_id);
		SubjectClass sc = new SubjectClass();
		sc.setClasses(clas);
		sc.setSubject(subject);
		subjectClassRepository.save(sc);
		return "redirect:/addSubject?id=" + class_id;
	}

}
