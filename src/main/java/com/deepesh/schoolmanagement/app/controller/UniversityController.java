package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.deepesh.schoolmanagement.app.model.University;
import com.deepesh.schoolmanagement.app.repository.UniversityRepository;

@Controller
public class UniversityController {

	@Autowired
	private UniversityRepository universityRepository;

	@ModelAttribute("university")
	public University getUniversity() {
		return new University();
	}

	@RequestMapping(value = "/addUniversities", method = RequestMethod.GET)
	public String loadAddUniversityForm() {
		return "addUniversity";
	}

	@RequestMapping(value = "add-addUniversity", method = RequestMethod.POST)
	public String addUniversity(@ModelAttribute("university") University university) {
		universityRepository.save(university);
		return "redirect:/viewUniversities";
	}

	@RequestMapping(value = "viewUniversities", method = RequestMethod.GET)
	public String loadUniversity(Model model) {
		model.addAttribute("universityList", universityRepository.findAll());
		return "viewUniversity";
	}

	@RequestMapping(value = "delete-deleteUniversity", method = RequestMethod.GET)
	public String deleteUniversity(@RequestParam("id") Long id) {
		universityRepository.deleteById(id);
		return "redirect:/viewUniversities";
	}
	
}
