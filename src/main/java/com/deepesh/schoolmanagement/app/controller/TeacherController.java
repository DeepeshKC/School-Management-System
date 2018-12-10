package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Teacher;
//import com.deepesh.schoolmanagement.app.repository.TeacherRepository;
import com.deepesh.schoolmanagement.app.model.UserType;
import com.deepesh.schoolmanagement.app.repository.TeacherRepository;

@Controller
public class TeacherController {
	@Autowired
	private TeacherRepository teacherRepository;

	@ModelAttribute("teacher")
	public Teacher getTeacher() {
		return new Teacher();
	}

	@RequestMapping(value = "/addTeachers", method = RequestMethod.GET)
	public String loadAddTeacher() {
		return "addTeacher";
	}

	@RequestMapping(value = "add-add-Teacher", method = RequestMethod.POST)
	public String addTeacher(@ModelAttribute("teacher") Teacher teacher) {
		UserType ur = new UserType();
		ur.setUserTypeId(4);
		teacher.setUserType(ur);
		teacherRepository.save(teacher);
		return "redirect:viewTeachers";
	}

	@RequestMapping(value = "viewTeachers", method = RequestMethod.GET)
	public String loadViewTeacher(Model model) {
		model.addAttribute("teachersList", teacherRepository.findAll());
		return "viewTeacher";
	}

	@RequestMapping(value = "delete-deleteTeacher", method = RequestMethod.GET)
	public String deleteTeacher(@RequestParam("id") Long id) {
		teacherRepository.deleteById(id);
		return "redirect:/viewTeachers";
	}
}
