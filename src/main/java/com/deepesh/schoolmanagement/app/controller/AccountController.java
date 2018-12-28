package com.deepesh.schoolmanagement.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deepesh.schoolmanagement.app.model.Admin;
import com.deepesh.schoolmanagement.app.model.AdministrativeStaff;
import com.deepesh.schoolmanagement.app.model.Login;
import com.deepesh.schoolmanagement.app.model.Parent;
import com.deepesh.schoolmanagement.app.model.Student;
import com.deepesh.schoolmanagement.app.model.Teacher;
import com.deepesh.schoolmanagement.app.repository.AccountRepository;
import com.deepesh.schoolmanagement.app.repository.RoutineRepository;
import com.deepesh.schoolmanagement.app.repository.StudentRepository;

@Controller
public class AccountController {

	
	
	
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private RoutineRepository routineRepository;
	@Autowired
	private HttpSession session;
	
	public Student getStudent() {
		return (Student) session.getAttribute("student");
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loadLogin() {
		return "login";
	}

	@RequestMapping(value = "/userLogin", method = {RequestMethod.POST, RequestMethod.GET})
	public String loginStudent(Login login, Model model, Model model2) {
		System.out.println(login.getUserType());
		if (login.getUserType().equals("Student")) {
			Student student = accountRepository.loginStudent(login.getUsername(), login.getPassword());

			if (student != null) {
				System.out.println("logged in");
				model.addAttribute("routineList", routineRepository.findRoutineByStudentId(student.getId()));
				model2.addAttribute("student", student);
				session.setAttribute("student", student);
				return "studentDasboard";
			} else {

				return "redirect:/login";
			}

		} else if (login.getUserType().equals("Admin")) {
			Admin admin = accountRepository.loginAdmin(login.getUsername(), login.getPassword());

			if (admin != null) {
				System.out.println("logged in");
				return "adminDashboard";
			} else {
				return "redirect:/login";
			}

		} else if (login.getUserType().equals("Teacher")) {
			Teacher teacher = accountRepository.loginTeacher(login.getUsername(), login.getPassword());

			if (teacher != null) {
				System.out.println("logged in");
				model.addAttribute("teacher", teacher.getTeacherId());
				return "teacherDashboard";
			} else {

				return "redirect:/login";
			}
		} else if (login.getUserType().equals("Parent")) {
			Parent parent = accountRepository.loginParent(login.getUsername(), login.getPassword());

			if (parent != null) {
				System.out.println(parent.getParentId());
				// model.addAttribute("subjectList",subject.getSubjectByStudent(parent.getParentId()));
				model.addAttribute("studentList", studentRepository.getStudentbyParent(parent.getParentId()));
				return "parentDashboard";
			} else {

				return "redirect:/login";
			}
		} else if (login.getUserType().equals("Administrative Staff")) {
			AdministrativeStaff as = accountRepository.loginAdministrativeStaff(login.getUsername(),
					login.getPassword());

			if (as != null) {
				System.out.println("logged in");
				return "administrationStaffDashboard";
			} else {

				return "redirect:/login";
			}
		} else {

			return "redirect:/login";
		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String redirectpage() {
		return "login";
	}

	
	
}
