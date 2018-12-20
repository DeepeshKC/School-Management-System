package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Classes;
import com.deepesh.schoolmanagement.app.model.Student;
import com.deepesh.schoolmanagement.app.model.StudentClass;
import com.deepesh.schoolmanagement.app.repository.StudentClassRepository;
import com.deepesh.schoolmanagement.app.repository.StudentRepository;

@Controller
public class StudentClassController {
	@Autowired
	private StudentClassRepository studentClassRepository;
	@Autowired
	private StudentRepository studentRepository;

	@ModelAttribute("studentClass")
	public StudentClass getStudentClass() {
		return new StudentClass();
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public String loadStudentList(@RequestParam("id") Long id, Model model1, Model model2) {
		Classes clas = new Classes();
		clas.setClassId(id);
		model1.addAttribute("classes", clas);
		model2.addAttribute("StudentList", studentRepository.findAll());
		return "addStudentClass";
	}

	@RequestMapping(value = "/addStudentClass", method = { RequestMethod.POST, RequestMethod.GET })
	public String AddStudentToClass(@RequestParam("id") Long id, @RequestParam("class_id") Long class_id) {
		Student st = new Student();
		st.setId(id);
		Classes clas = new Classes();
		clas.setClassId(class_id);
		StudentClass stt = new StudentClass();
		stt.setStudent(st);
		stt.setClasses(clas);
		studentClassRepository.save(stt);
		return "redirect:/addStudent?id=" + class_id;
	}
	
	
	@RequestMapping(value = "/promoteStudent", method =RequestMethod.GET )
	public String PromoteStudent(@RequestParam("id")Long id, @RequestParam("student_id")Long student_id)
	{
		
		Student student=new Student();
		student.setId(student_id);
		
		
		Classes classes=new Classes();
		classes.setClassId(id+1);
		StudentClass st=studentClassRepository.getIdByStudentandClass(id, student_id);
		Long idd=st.getId();
		StudentClass stt=new StudentClass();
		stt.setId(idd);
		stt.setStudent(student);
		stt.setClasses(classes);
		studentClassRepository.save(stt);
		
		return "redirect:/viewClassLedgerDefault?class_id="+id;

}
}
