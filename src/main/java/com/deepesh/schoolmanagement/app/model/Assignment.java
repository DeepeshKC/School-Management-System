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
@Table(name = "tbl_assignment")
public class Assignment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="assignment_id")
	private Long assignmentId;

	@Column(name = "assignment_title")
	private String assignmentTitle;

	@Column(name = "assignment_description")
	private String assignmentDescription;

	@Column(name = "assignment_deadline")
	private String assignmentDeadline;

	@Column(name = "assignment_file")
	private String assignmentFile;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	private Classes classes;

	public Long getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getAssignmentTitle() {
		return assignmentTitle;
	}

	public void setAssignmentTitle(String assignmentTitle) {
		this.assignmentTitle = assignmentTitle;
	}

	public String getAssignmentDescription() {
		return assignmentDescription;
	}

	public void setAssignmentDescription(String assignmentDescription) {
		this.assignmentDescription = assignmentDescription;
	}

	public String getAssignmentDeadline() {
		return assignmentDeadline;
	}

	public void setAssignmentDeadline(String assignmentDeadline) {
		this.assignmentDeadline = assignmentDeadline;
	}

	public String getAssignmentFile() {
		return assignmentFile;
	}

	public void setAssignmentFile(String assignmentFile) {
		this.assignmentFile = assignmentFile;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

}
