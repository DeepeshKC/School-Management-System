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
@Table(name = "tbl_exam")
public class Exam {
	@Id
	@Column(name = "exam_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long examId;

	@Column(name = "exam_title")
	private String examTitle;

	@Column(name = "exam_decription")
	private String examDescription;

	@Column(name = "exam_date")
	private String examDate;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "exam")
	private List<ExamMarks> examMarks = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "exam")
	private List<TestPaper> test = new ArrayList<>();
	

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public String getExamDescription() {
		return examDescription;
	}

	public void setExamDescription(String examDescription) {
		this.examDescription = examDescription;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public List<ExamMarks> getExamMarks() {
		return examMarks;
	}

	public void setExamMarks(List<ExamMarks> examMarks) {
		this.examMarks = examMarks;
	}

	public List<TestPaper> getTest() {
		return test;
	}

	public void setTest(List<TestPaper> test) {
		this.test = test;
	}

}
