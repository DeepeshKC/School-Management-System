package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deepesh.schoolmanagement.app.model.Login;
import com.deepesh.schoolmanagement.app.model.Student;
import com.deepesh.schoolmanagement.app.repository.AccountRepository;

@Controller
public class AccountController {

	@Autowired private AccountRepository accountRepository;
	
	@RequestMapping(value="/studentLogin", method= RequestMethod.POST )
	public String loginStudent(Login login) {
		Student student=accountRepository.login(login.getUsername(), login.getPassword());
		
		System.out.println("student"+student.getEmail());
		
		if(student!=null) {
			System.out.println("logged in");
			return "redirect:/studentDashboard";
		} 
		else {
			System.out.println("invalid");
			return "/login";
		}
		
	}
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String redirectpage() {
		return "login";
	}
	
	
}
