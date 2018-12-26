package com.deepesh.schoolmanagement.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.deepesh.schoolmanagement.app.model.Classes;
import com.deepesh.schoolmanagement.app.model.Routine;
import com.deepesh.schoolmanagement.app.model.Subject;
import com.deepesh.schoolmanagement.app.repository.ClassesRepository;
import com.deepesh.schoolmanagement.app.repository.DayRepository;
import com.deepesh.schoolmanagement.app.repository.RoutineRepository;
import com.deepesh.schoolmanagement.app.repository.SubjectRepository;

@Controller
public class RoutineController {

	@Autowired
	private RoutineRepository routineRepository;

	@Autowired
	private ClassesRepository classesRepository;

	@Autowired
	private SubjectRepository subjectRepository;
	@Autowired
	private DayRepository dayRepository;

	@ModelAttribute(name = "routine")
	private Routine getRoutine() {
		return new Routine();
	}

	@RequestMapping(value = "/addRoutines", method = RequestMethod.GET)
	public String loadAddRoutine(Model model, Model model1, Model model2) {
		model.addAttribute("dayList", dayRepository.findAll());
		model1.addAttribute("classList", classesRepository.findAll());
		model2.addAttribute("subjectList", subjectRepository.findAll());
		return "addRoutine";
	}

	@RequestMapping(value = "add-addRoutine", method = RequestMethod.POST)
	public String addRoutine(@ModelAttribute("routine") Routine routine) {
		routineRepository.save(routine);
		return "redirect:/viewRoutines";
	}

	@RequestMapping(value = "**/staff/viewRoutines", method = RequestMethod.GET)
	public String viewRoutine(Model model) {
		model.addAttribute("routineList", routineRepository.findAll());

		return "staffViewRoutine";
	}
	
	@RequestMapping(value = "**/teacher/viewRoutines", method = RequestMethod.GET)
	public String teacher_viewRoutine(@RequestParam("id")Long id,Model model) {
		model.addAttribute("routineList", routineRepository.findRoutineByClassId(id));

		return "teacherViewRoutine";
	}
	@RequestMapping(value = "**/student/viewRoutines", method = RequestMethod.GET)
	public String student_viewRoutine(@RequestParam("id")Long id, Model model) {
		model.addAttribute("routineList", routineRepository.findRoutineByClassId(id));

		return "studentViewRoutine";
	}

	@RequestMapping(value = "update-updateRoutine", method = RequestMethod.POST)
	public String updateRoutine(@RequestParam("id") Long id, Model model) {
		Optional<Routine> routine = routineRepository.findById(id);
		Routine r = routine.get();
		Classes c = new Classes();
		Subject subject = new Subject();
		// model1.

		return "redirect:/viewRoutines";
	}

	@RequestMapping(value = "delete-deleteRoutine", method = RequestMethod.GET)
	public String deleteRoutine(@RequestParam("id") Long id) {
		routineRepository.deleteById(id);
		return "redirect:/viewRoutines";
	}

	@RequestMapping(value = "viewRoutineClass", method = RequestMethod.GET)
	public String viewRoutineByClass(@RequestParam("id") Long id, Model model) {
		model.addAttribute("routineList", routineRepository.findRoutineByClassId(id));
		return "viewRoutine";
	}

}
