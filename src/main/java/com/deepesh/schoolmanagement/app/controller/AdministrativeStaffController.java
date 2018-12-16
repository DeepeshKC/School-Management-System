package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.model.AdministrativeStaff;
import com.deepesh.schoolmanagement.app.model.UserType;
import com.deepesh.schoolmanagement.app.repository.AdministrativeStaffRepository;

@Controller
public class AdministrativeStaffController {

	@Autowired
	private AdministrativeStaffRepository administrativeStaffRepository;

	@ModelAttribute("administrativeStaff")
	public AdministrativeStaff getAdministrativeStaff() {
		return new AdministrativeStaff();
	}

	@RequestMapping(value = "/addAdminStaffs", method = RequestMethod.GET)
	public String loadAddAdminStaffForm() {
		return "addAdminStaff";
	}

	@RequestMapping(value = "add-addAdminStaff", method = RequestMethod.POST)
	public String addAdminStaff(@ModelAttribute("administrativeStaff") AdministrativeStaff adminStaff) {
		UserType ut = new UserType();
		ut.setUserTypeId(5);
		adminStaff.setUserType(ut);
		administrativeStaffRepository.save(adminStaff);
		return "redirect:/viewAdminStaffs";
	}

	@RequestMapping(value = "viewAdminStaffs", method = RequestMethod.GET)
	public String loadViewAdminStaff(Model model) {
		model.addAttribute("adminStaffList", administrativeStaffRepository.findAll());
		return "viewAdminStaff";
	}

	@RequestMapping(value = "delete-deleteAdminStaff", method = RequestMethod.GET)
	public String deleteAdminStaff(@RequestParam("id") Long id) {
		administrativeStaffRepository.deleteById(id);
		return "redirect:/viewAdminStaffs";
	}

//	@RequestMapping(value = "/updateadminStaffs", method = RequestMethod.GET)
//	public String loadUpdatAdminStaffForm(@RequestParam("id") Long id, Model model) {
//		Optional<AdministrativeStaff> administrativeStaff = administrativeStaffRepository.findById(id);
//		AdministrativeStaff as = new AdministrativeStaff();
//		model.addAttribute("administrativeStaff", as);
//		return "updateAdminStaff";
//	}
//
//	@RequestMapping(value = "update-updateAdminStaff", method = RequestMethod.POST)
//	public String updateadministrativeStaff(
//			@ModelAttribute("administrativeStaff") AdministrativeStaff administrativeStaff) {
//		UserType ur = new UserType();
//		ur.setUserTypeId(3);
//		administrativeStaff.setUserType(ur);
//		administrativeStaffRepository.save(administrativeStaff);
//		return "redirect:/viewAdminStaffs";
//	}
}
