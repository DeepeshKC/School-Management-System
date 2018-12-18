package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Classes;
import com.deepesh.schoolmanagement.app.model.Teacher;
import com.deepesh.schoolmanagement.app.model.TeacherClass;
import com.deepesh.schoolmanagement.app.repository.TeacherClassRepository;
import com.deepesh.schoolmanagement.app.repository.TeacherRepository;

@Controller
public class TeacherClassController {

	@Autowired
	private TeacherClassRepository teacherClassRepository;

	@Autowired
	private TeacherRepository teacherRepository;
	
	@ModelAttribute("teacherClass")
	public TeacherClass getTeacherClass() {
		return new TeacherClass();
	}

	@RequestMapping(value = "/addTeacher", method = RequestMethod.GET)
	public String loadTeacherList(@RequestParam("id") Long id, Model model1, Model model2) {
		Classes clas = new Classes();
		clas.setClassId(id);
		model1.addAttribute("classes", clas);
		model2.addAttribute("teachersList", teacherRepository.findAll());
		return "addTeacherClass";
	}
	
	@RequestMapping(value="/addTeacherClass", method={ RequestMethod.POST, RequestMethod.GET })
	public String addTeacherToClass(@RequestParam("id") Long id, @RequestParam("class_id") Long class_id) {
		Teacher t= new Teacher();
		t.setTeacherId(id);
		Classes clas = new Classes();
		clas.setClassId(class_id);
		TeacherClass tc= new TeacherClass();
		tc.setTeacher(t);
		tc.setClasses(clas);
		teacherClassRepository.save(tc);
		return "redirect:/addTeacher?id=" +class_id;
		
	}
}
