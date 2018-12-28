package com.deepesh.schoolmanagement.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_class")
public class Classes {
	@Id
	@Column(name = "class_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classId;

	@Column(name = "class_name")
	private String className;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<Subject> subject = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<Teacher> teacher = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes1")
	private List<QuestionPaper> questionpaper = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<StudentClass> studentClass = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<TeacherClass> teacherClass = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "class1")
	private List<ExamMarks> examMarks = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<Assignment> assignment = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<Attendance> attendance = new ArrayList<>();
	

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<TestPaper> test = new ArrayList<>();
	
	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<QuestionPaper> getQuestionpaper() {
		return questionpaper;
	}

	public void setQuestionpaper(List<QuestionPaper> questionpaper) {
		this.questionpaper = questionpaper;
	}

	public List<StudentClass> getStudentClass1() {
		return studentClass;
	}

	public List<TeacherClass> getTeacherClass() {
		return teacherClass;
	}

	public void setTeacherClass(List<TeacherClass> teacherClass) {
		this.teacherClass = teacherClass;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<ExamMarks> getExamMarks() {
		return examMarks;
	}

	public void setExamMarks(List<ExamMarks> examMarks) {
		this.examMarks = examMarks;
	}

	public List<StudentClass> getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(List<StudentClass> studentClass) {
		this.studentClass = studentClass;
	}

	public List<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(List<Assignment> assignment) {
		this.assignment = assignment;
	}

	public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}

	public List<TestPaper> getTest() {
		return test;
	}

	public void setTest(List<TestPaper> test) {
		this.test = test;
	}

}
