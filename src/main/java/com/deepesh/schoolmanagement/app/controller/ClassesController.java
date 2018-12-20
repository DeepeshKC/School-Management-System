package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Classes;
import com.deepesh.schoolmanagement.app.repository.ClassesRepository;

@Controller
public class ClassesController {
	@Autowired
	private ClassesRepository classRepository;

	@ModelAttribute("classes")
	public Classes getClasses() {
		return new Classes();
	}

	@RequestMapping(value = "addClasses", method = RequestMethod.GET)
	public String loadAddClassPage() {
		return "addClasses";
	}

	@RequestMapping(value = "add-add-class", method = RequestMethod.POST)
	public String addClasses(@ModelAttribute("classes") Classes classes) {
		classRepository.save(classes);
		return "redirect:/viewClasses";
	}

	@RequestMapping(value = "**/viewClasses", method = RequestMethod.GET)
	public String viewClass(Model model) {
		model.addAttribute("classList", classRepository.findAll());
		return "viewClass";
	}

	@RequestMapping(value = "/teacherViewClasses", method = RequestMethod.GET)
	public String teacherViewClass(Model model) {
		model.addAttribute("classList", classRepository.findAll());
		return "teacherViewClass";
	}

	@RequestMapping(value = "deleteClasses", method = RequestMethod.GET)
	public String deleteClass(@RequestParam("id") Long id) {
		classRepository.deleteById(id);
		return "redirect:/viewClasses";
	}
}
