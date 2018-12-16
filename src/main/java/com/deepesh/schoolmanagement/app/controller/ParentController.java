package com.deepesh.schoolmanagement.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.deepesh.schoolmanagement.app.model.Parent;
import com.deepesh.schoolmanagement.app.model.UserType;
import com.deepesh.schoolmanagement.app.repository.ParentRepository;

@Controller
public class ParentController {

	@Autowired
	private ParentRepository parentRepository;

	@ModelAttribute("parent")
	public Parent getParent() {
		return new Parent();
	}

	@RequestMapping(value = "/addParents", method = RequestMethod.GET)
	public String loadAddParents() {
		return "addParent";
	}

	@RequestMapping(value = "add-addParent", method = RequestMethod.POST)
	public String loadAddParents(@ModelAttribute("Parent") Parent parent) {
		UserType ut = new UserType();
		ut.setUserTypeId(3);
		parent.setUserType(ut);
		parentRepository.save(parent);
		return "redirect:/viewParents";
	}

	@RequestMapping(value = "viewParents", method = RequestMethod.GET)
	public String loadViewParents(Model model) {
		model.addAttribute("parentList", parentRepository.findAll());
		return "viewParent";
	}

	@RequestMapping(value = "delete-deleteParent", method = RequestMethod.GET)
	public String deleteParent(@RequestParam("id") Long id) {
		parentRepository.deleteById(id);
		return "redirect:/viewParents";
	}

	/*@RequestMapping(value = "/updateParents", method = RequestMethod.GET)
	public String loadUpdateParentForm(@RequestParam("id") Long id, Model model) {
		Optional<Parent> parent = parentRepository.findById(id);
		Parent p = new Parent();
		model.addAttribute("parent", p);
		return "updateParent";
	}

	@RequestMapping(value = "update-updateParent", method = RequestMethod.POST)
	public String updateParent(@ModelAttribute("parent") Parent parent) {
		UserType ur = new UserType();
		ur.setUserTypeId(3);
		parent.setUserType(ur);
		parentRepository.save(parent);
		return "redirect:viewparents";
	}*/
}