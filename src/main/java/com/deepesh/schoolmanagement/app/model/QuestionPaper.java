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
@Table(name = "tbl_question_paper")
public class QuestionPaper {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long questionPaperId;

	@Column(name = "question_paper_name")
	private String questionPaperName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	public Classes classes;

	public Long getQuestionPaperId() {
		return questionPaperId;
	}

	public void setQuestionPaperId(Long questionPaperId) {
		this.questionPaperId = questionPaperId;
	}

	public String getQuestionPaperName() {
		return questionPaperName;
	}

	public void setQuestionPaperName(String questionPaperName) {
		this.questionPaperName = questionPaperName;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

}
