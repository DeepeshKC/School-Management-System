package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deepesh.schoolmanagement.app.MailSender;
import com.deepesh.schoolmanagement.app.model.Mail;

@Controller
public class EmailController {
	@ModelAttribute("mail")
	public Mail getMail() {
		return new Mail();
	}

	@RequestMapping(value = "/sendMail", method = RequestMethod.POST)
	public String sendMail(@ModelAttribute("mail") Mail mail) {
		MailSender.sendMail(mail.receiver, mail.message, mail.subject);
		return "redirect:/viewParents";
	}
	
	@RequestMapping(value="email", method=RequestMethod.GET)
	public String loadEmailForm(@RequestParam("id")String email,Model model) {
		model.addAttribute("email", email);
		return "sendEmail";
	}
}
