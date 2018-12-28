package com.deepesh.schoolmanagement.app.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.deepesh.schoolmanagement.app.model.ExamMarks;
import com.deepesh.schoolmanagement.app.repository.ClassesRepository;
import com.deepesh.schoolmanagement.app.repository.ExamMarksRepository;
import com.deepesh.schoolmanagement.app.repository.ExamRepository;
import com.deepesh.schoolmanagement.app.repository.StudentClassRepository;
import com.deepesh.schoolmanagement.app.repository.SubjectRepository;

@Controller
public class ExamMarksController {
	@Autowired
	private ClassesRepository classRepository;
	@Autowired
	private StudentClassRepository studentClassRepository;
	@Autowired
	private ExamRepository examRepository;
	@Autowired
	private SubjectRepository subjectRepository;
	@Autowired
	private ExamMarksRepository examMarksRepository;

	@ModelAttribute("examMarks")
	public ExamMarks getExamMarks() {
		return new ExamMarks();
	}

	@RequestMapping(value = "/addExamMark", method = RequestMethod.GET)
	public String loadAddExamMarks(Model model) {
		model.addAttribute("classList", classRepository.findAll());
		return "addExamMarks";
	}

	@RequestMapping(value = "/addMarks", method = RequestMethod.GET)
	public String loadstudent(@RequestParam("id") Long id, Model model, Model model1) {

		model.addAttribute("studentList", studentClassRepository.getStudentByClass(id));
		model1.addAttribute("class_id", id);
		return "addStudentMarks";
	}

	@RequestMapping(value = "addStudentMarks", method = RequestMethod.GET)
	public String addExamMarks(@RequestParam("id") Long id, @RequestParam("class_id") Long class_id, Model model1,
			Model model2, Model model3, Model model4) {
		model1.addAttribute("student_id", id);
		model2.addAttribute("class_id", class_id);
		model3.addAttribute("examList", examRepository.findAll());
		model4.addAttribute("subjectList", subjectRepository.findAll());
		return "assignMarks";

	}

	@RequestMapping(value = "add-addMarks", method = RequestMethod.POST)
	public String addMarks(@ModelAttribute("examMarks") ExamMarks examMarks) {
		examMarksRepository.save(examMarks);
		return "redirect:/viewStudentMark";
	}

	@RequestMapping(value = "viewStudentMark", method = RequestMethod.GET)
	public String viewStudentMarks(Model model) {
		model.addAttribute("examMarksList", examMarksRepository.findAll());
		return "viewStudentMarks";
		

	}
	
	@RequestMapping(value = "student/viewStudentMarks", method = RequestMethod.GET)
	public String viewStudentExam(@RequestParam("id") Long id,Model model,Model model1) {
		model.addAttribute("examList", examRepository.findAll());
		model1.addAttribute("student", id);
		return "studentViewExam";
	}
	
	@RequestMapping(value = "**/student/viewMarks", method = RequestMethod.GET)
	public String student_viewStudentMarks(@RequestParam("id")Long exam_id, @RequestParam("student_id")Long student_id,Model model, Model model2, Model model3) {
		Optional<ExamMarks> exam= examMarksRepository.findByStudentAndClass(exam_id, student_id);
		ExamMarks em=exam.get();
		double total=em.getEnglish()+em.getScience()+em.getNepali()+em.getComputer()+em.getMath();
		double percentage=total/5;
		model.addAttribute("examMarks", em);
		model2.addAttribute("total", total);
		model3.addAttribute("percentage", percentage);
		return "studentViewExamMarks";

	}
	
	@RequestMapping(value = "**/parent/viewMarks", method = RequestMethod.GET)
	public String parent_viewStudentMarks(@RequestParam("id")Long exam_id, @RequestParam("student_id")Long student_id,Model model, Model model2, Model model3) {
		Optional<ExamMarks> exam= examMarksRepository.findByStudentAndClass(exam_id, student_id);
		ExamMarks em=exam.get();
		double total=em.getEnglish()+em.getScience()+em.getNepali()+em.getComputer()+em.getMath();
		double percentage=total/5;
		model.addAttribute("examMarks", em);
		model2.addAttribute("total", total);
		model3.addAttribute("percentage", percentage);
		return "parentStudentMarks";

	}
	
	@RequestMapping(value = "/viewLedger", method = RequestMethod.GET)
	public String viewClassLedger(@RequestParam("id") Long id, Model model, Model model1) {

		model.addAttribute("classList", classRepository.findAll());
		model1.addAttribute("exam_id", id);
		return "viewLedgerClass";

	
	}
	
	@RequestMapping(value = "viewClassLedger", method = RequestMethod.GET)
	public String viewStudentMarks(@RequestParam("id")Long exam_id, @RequestParam("class_id")Long class_id, Model model) {
		model.addAttribute("examMarksList",examMarksRepository.getMarksByClass(exam_id, class_id));
		return "viewStudentMarks";

	}
	
	@RequestMapping(value = "viewClassLedgerDefault", method = RequestMethod.GET)
	public String viewStudentMarks( @RequestParam("class_id")Long class_id, Model model) {
		model.addAttribute("examMarksList",examMarksRepository.getMarksByClass(Long.parseLong(String.valueOf(3)), class_id));
		return "viewStudentMarks";

	}
}
