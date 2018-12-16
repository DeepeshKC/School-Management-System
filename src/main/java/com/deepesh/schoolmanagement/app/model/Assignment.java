package com.deepesh.schoolmanagement.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_assignment")
public class Assignment {
	@Id
	@GeneratedValue

	private long assignmentId;

	@Column(name = "assignement_title")
	private String assignmentTitle;

	@Column(name = "assignment_description")
	private String assignmentDescription;

	@Column(name = "assignment_deadline")
	private Date assignmentDeadline;
	
	@Column(name="assignment_file")
	private String assignmentFile; 

	public long getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(long assignmentId) {
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

	public Date getAssignmentDeadline() {
		return assignmentDeadline;
	}

	public void setAssignmentDeadline(Date assignmentDeadline) {
		this.assignmentDeadline = assignmentDeadline;
	}

}
