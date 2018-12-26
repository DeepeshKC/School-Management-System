package com.deepesh.schoolmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalendarController {
	
@RequestMapping(value="**/studentCalendars", method=RequestMethod.GET)
public String loadCalendar() {
	return "studentCalendar";
}
@RequestMapping(value="**/teacherCalendars", method=RequestMethod.GET)
public String teacher_loadCalendar() {
	return "teacherCalendar";
}
@RequestMapping(value="**/parentCalendars", method=RequestMethod.GET)
public String parent_loadCalendar() {
	return "parentCalendar";
}
@RequestMapping(value="**/staffCalendars", method=RequestMethod.GET)
public String staff_loadCalendar() {
	return "calendar";
}
}
