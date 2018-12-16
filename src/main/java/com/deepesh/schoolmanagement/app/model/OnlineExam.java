package com.deepesh.schoolmanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_online_exam")
public class OnlineExam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long onlineExamId;

	@Column(name = "subject")
	private String subject;

	@Column(name = "total_questions")
	private String totalQuestions;

	@Column(name = "marks")
	private String marks;
	
	@Column(name="time_limit")
	private String timeLimit;

	public Long getOnlineExamId() {
		return onlineExamId;
	}

	public void setOnlineExamId(Long onlineExamId) {
		this.onlineExamId = onlineExamId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(String totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}

}
