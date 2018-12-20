package com.deepesh.schoolmanagement.app.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

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
		University u = new University();
		u.setUniversityId(id);
		model1.addAttribute("university", u);
		model2.addAttribute("studentsList", studentRepository.findAll());
		return "viewUniversityStudent";
	}

	@RequestMapping(value = "/viewUniversityStudent", method = { RequestMethod.POST, RequestMethod.GET })
	public String addUniversityStudent(@RequestParam("id") Long id, @RequestParam("university_id") Long university_id)
			throws Exception {
		DateFormat dateFormat = new SimpleDateFormat();
		Date date = new Date();
		Date date1 = dateFormat.parse(dateFormat.format(date));
		Student s = new Student();
		s.setId(university_id);
		University uni = new University();
		uni.setUniversityId(university_id);
		UniversityStudent us = new UniversityStudent();
		us.setUniversity(uni);
		us.setStudent(s);
		us.setEnrollDate(date1);
		us.setStatus(true);
		universityStudentRepository.save(us);
		return "redirect:/enrollStudents?id=" + university_id;
	}
	
	@RequestMapping(value="/updateUniversityStudents", method = RequestMethod.GET)
	public String loadUpdateForm(@RequestParam("id") Long id, Model model) {
		Optional<UniversityStudent> universityStudent= universityStudentRepository.findById(id);
		UniversityStudent us= universityStudent.get();
		model.addAttribute("universityStudent", us);
		return "updateUniversityStudent";
	}
	
	@RequestMapping(value="update-updateUiversityStudent", method= RequestMethod. POST)
	public String updateUniversityStudent(@ModelAttribute("universityStudent") UniversityStudent universityStudent) {
		//universityStudentRepository.save();
		return "redirect:/viewUniversityStudents";
		
	}
}
