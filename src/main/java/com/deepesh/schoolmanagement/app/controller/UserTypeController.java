package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.UserType;
import com.deepesh.schoolmanagement.app.repository.UserTypeRepository;

@Controller
public class UserTypeController {
	@Autowired
	private UserTypeRepository userTypeRepository;

	@ModelAttribute("userType")
	public UserType getUserType() {
		return new UserType();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loadDashboard() {
		return "dashboard";
	}

	@RequestMapping(value = "userTypeForm", method = RequestMethod.GET)
	public String loadUserType() {
		return "addUserType";
	}

	@RequestMapping(value = "add-userType", method = RequestMethod.POST)
	public String addUserType(@ModelAttribute("userType") UserType userType) {
		userTypeRepository.save(userType);
		return "redirect:/viewUserTypes";
	}

	@RequestMapping(value = "viewUserTypes", method = RequestMethod.GET)
	public String viewUserType(Model model) {
		model.addAttribute("userTypeList", userTypeRepository.findAll());
		return "viewUserType";
	}

	@RequestMapping(value = "deleteType", method = RequestMethod.GET)
	public String deleteType(@RequestParam("id") Long id) {
		userTypeRepository.deleteById(id);
		return "redirect:/viewUserTypes";
	}

}
