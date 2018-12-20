package com.deepesh.schoolmanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_exam_marks")
public class ExamMarks {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column(name = "math")
	private double math;
	
	@Column(name = "science")
	private double science;
	
	@Column(name = "english")
	private double english;
	
	
	@Column(name = "nepali")
	private double nepali;
	
	@Column(name = "computer")
	private double computer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private Classes class1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exam_id")
	private Exam exam;
	
	@Column(name="status")
	private String status;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Classes getClass1() {
		return class1;
	}

	public void setClass1(Classes class1) {
		this.class1 = class1;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}



	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getScience() {
		return science;
	}

	public void setScience(double science) {
		this.science = science;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getNepali() {
		return nepali;
	}

	public void setNepali(double nepali) {
		this.nepali = nepali;
	}

	public double getComputer() {
		return computer;
	}

	public void setComputer(double computer) {
		this.computer = computer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
