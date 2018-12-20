package com.deepesh.schoolmanagement.app.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Attendance;
import com.deepesh.schoolmanagement.app.model.Student;
import com.deepesh.schoolmanagement.app.repository.AttendanceRepository;
import com.deepesh.schoolmanagement.app.repository.StudentRepository;

@Controller
public class AttendanceController {

	@Autowired
	private AttendanceRepository attendanceRepository;
	@Autowired
	private StudentRepository studentRepository;

	@ModelAttribute("attendance")
	public Attendance attendance() {
		return new Attendance();
	}
	
	@ModelAttribute("student")
	public Student getStudent() {
		return new Student();
	}

	@RequestMapping(value = "/teacherViewStudents", method = RequestMethod.GET)
	public String loadViewStudent(Model model) {
		model.addAttribute("studentsList", studentRepository.findAll());
		return "teacherViewStudent";
	}

	@RequestMapping(value = "/presentStudents", method = {RequestMethod.POST, RequestMethod.GET})
	public String presentStudent(@RequestParam("id") Long id) throws Exception{
		DateFormat dateFormat= new SimpleDateFormat();
		Date date=new Date();
		Date date1=dateFormat.parse(dateFormat.format(date));
		Student std = new Student();
		std.setId(id);
		Attendance att = new Attendance();
		att.setDate(date1);
		att.setStudent(std);
		att.setStatus("Present");
		attendanceRepository.save(att);
		return "redirect:/teacherViewStudents";
	}

	@RequestMapping(value = "/absentStudents", method = {RequestMethod.POST, RequestMethod.GET})
	public String absentStudent(@RequestParam("id") Long id)throws Exception {
		DateFormat dateFormat= new SimpleDateFormat();
		Date date=new Date();
		Date date1=dateFormat.parse(dateFormat.format(date));
		Student std = new Student();
		std.setId(id);
		Attendance att = new Attendance();
		att.setStudent(std);
		att.setDate(date1);
		att.setStatus("Absent");
		attendanceRepository.save(att);
		return "redirect:/teacherViewStudents";
	}

	@RequestMapping(value = "/lateStudents", method = {RequestMethod.POST, RequestMethod.GET})
	public String lateStudent(@RequestParam("id") Long id) throws Exception{
		DateFormat dateFormat= new SimpleDateFormat();
		Date date=new Date();
		Date date1=dateFormat.parse(dateFormat.format(date));
		Student std = new Student();
		std.setId(id);
		Attendance att = new Attendance();
		att.setStudent(std);
		att.setDate(date1);
		att.setStatus("Late Arrival");
		attendanceRepository.save(att);
		return "redirect:/teacherViewStudents";
	}

}
