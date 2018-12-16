package com.deepesh.schoolmanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_exam_marks")
public class ExamMarks {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long examMarksId;
	
	@Column(name="attendance_marks")
	private String attendanceMarks;
	
	@Column(name="mark_comments")
	private String markComments;
	
	
}
