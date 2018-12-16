package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.Admin;
import com.deepesh.schoolmanagement.app.model.UserType;
import com.deepesh.schoolmanagement.app.repository.AdminRepository;

@Controller
public class AdminController {

	@Autowired
	private AdminRepository adminRepository;

	@ModelAttribute("admin")
	public Admin getAdmin() {
		return new Admin();
	}

	@RequestMapping(value = "/addAdmins", method = RequestMethod.GET)
	public String loadAddAdmin() {
		return "addAdmin";
	}

	@RequestMapping(value = "add-addAdmin", method = RequestMethod.POST)
	public String addAdmin(@ModelAttribute("admin") Admin admin) {
		UserType ut = new UserType();
		ut.setUserTypeId(1);
		admin.setUserType(ut);
		adminRepository.save(admin);
		return "redirect:/viewAdmins";
	}

	@RequestMapping(value = "/viewAdmins", method = RequestMethod.GET)
	public String viewAdmin(Model model) {
		model.addAttribute("adminsList", adminRepository.findAll());
		return "viewAdmin";

	}

	@RequestMapping(value = "delete-deleteAdmin", method = RequestMethod.GET)
	public String deleteAdmin(@RequestParam("id") Long id) {
		adminRepository.deleteById(id);
		return "redirect:/viewAdmins";
	}

	/*
	 * @RequestMapping(value = "/updateAdmins", method = RequestMethod.GET) public
	 * String loadUpdateAdminForm(@RequestParam("id") Long id, Model model) {
	 * Optional<Admin> admin = adminRepository.findById(id); Admin a = new Admin();
	 * model.addAttribute("admin", a); return "updateAdmin"; }
	 * 
	 * @RequestMapping(value = "update-updateAdmin", method = RequestMethod.POST)
	 * public String updateadmin(@ModelAttribute("admin") Admin admin) { UserType ur
	 * = new UserType(); ur.setUserTypeId(3); admin.setUserType(ur);
	 * adminRepository.save(admin); return "redirect:viewAdmins"; }
	 */
}
