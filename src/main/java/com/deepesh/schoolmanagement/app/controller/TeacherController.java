package com.deepesh.schoolmanagement.app.controller;

import java.util.Optional;

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
	public String loadAddTeacherForm() {
		return "addTeacher";
	}

	@RequestMapping(value = "add-addTeacher", method = RequestMethod.POST)
	public String addTeacher(@ModelAttribute("teacher") Teacher teacher) {
		UserType ur = new UserType();
		ur.setUserTypeId(4);
		teacher.setUserType(ur);
		teacherRepository.save(teacher);
		return "redirect:/viewTeachers";
	}

	@RequestMapping(value = "viewTeachers", method = RequestMethod.GET)
	public String loadViewTeacher(Model model) {
		model.addAttribute("teachersList", teacherRepository.findAll());
		return "viewTeacher";
	}
	
	@RequestMapping(value = "**/studentViewTeachers", method = RequestMethod.GET)
	public String student_loadViewTeacher(Model model) {
		model.addAttribute("teachersList", teacherRepository.findAll());
		return "studentViewTeacher";
	}

	@RequestMapping(value = "delete-deleteTeacher", method = RequestMethod.GET)
	public String deleteTeacher(@RequestParam("id") Long id) {
		teacherRepository.deleteById(id);
		return "redirect:/viewTeachers";
	}
	
	@RequestMapping(value="updateTeachers", method=RequestMethod.GET)
	public String loadUpdateTeacherForm(@RequestParam("id")Long id, Model model) {
		Optional<Teacher> teacher=teacherRepository.findById(id);
		Teacher tea=teacher.get();
		model.addAttribute("teachers", tea);
		return "updateTeacher";
		
		
	}
	
	@RequestMapping(value="update-updateTeacher", method=RequestMethod.POST)
	public String updateTeacher(@ModelAttribute("teacher")Teacher teacher) {
		
		teacherRepository.save(teacher);
		return "redirect:viewTeachers";
	}
}
