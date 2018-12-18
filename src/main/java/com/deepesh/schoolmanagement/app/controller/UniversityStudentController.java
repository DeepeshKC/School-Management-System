package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Student;
import com.deepesh.schoolmanagement.app.model.University;
import com.deepesh.schoolmanagement.app.model.UniversityStudent;
import com.deepesh.schoolmanagement.app.repository.StudentRepository;
import com.deepesh.schoolmanagement.app.repository.UniversityStudentRepository;

@Controller
public class UniversityStudentController {

	@Autowired
	private UniversityStudentRepository universityStudentRepository;
	@Autowired
	private StudentRepository studentRepository;

	@ModelAttribute("univerityStudent")
	public UniversityStudent getUniversityStudent() {
		return new UniversityStudent();
	}

	@RequestMapping(value = "/enrollStudents", method = RequestMethod.GET)
	public String loadStudentList(@RequestParam("id") Long id, Model model1, Model model2) {
		University uni = new University();
		uni.setUniversityId(id);
		model1.addAttribute("university", uni);
		model2.addAttribute("StudentList", studentRepository.findAll());
		return "addUniversityStudent";
	}

	@RequestMapping(value = "/addUniversityStudent", method = { RequestMethod.POST, RequestMethod.GET })
	public String addUniversityStudent(@RequestParam("id") Long id,
			@RequestParam("university_id") Long university_id) {
		Student s = new Student();
		s.setId(university_id);
		University uni = new University();
		uni.setUniversityId(university_id);
		UniversityStudent us = new UniversityStudent();
		us.setUniversity(uni);
		us.setStudent(s);
		universityStudentRepository.save(us);
		return "redirect:/enrollStudents?id=" + university_id;
	}
}
