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

	@Column(name = "exam_date")
	private String examDate;

	@Column(name = "exam_end_date")
	private String examEndDate;

	@Column(name = "exam_question")
	private String examQuestion;

}
