package com.deepesh.schoolmanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long reportId;

	@Column(name = "report_name")
	private String reportName;

	@Column(name = "date_created")
	private String dateCreated;

	@Column(name = "report_content")
	private String reportContent;

	@Column(name = "other_report_details")
	private String otherReportDetails;

	@Column(name = "teacher_remarks")
	private String teacherRemarks;

	public long getReportId() {
		return reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getReportContent() {
		return reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public String getOtherReportDetails() {
		return otherReportDetails;
	}

	public void setOtherReportDetails(String otherReportDetails) {
		this.otherReportDetails = otherReportDetails;
	}

	public String getTeacherRemarks() {
		return teacherRemarks;
	}

	public void setTeacherRemarks(String teacherRemarks) {
		this.teacherRemarks = teacherRemarks;
	}

}
