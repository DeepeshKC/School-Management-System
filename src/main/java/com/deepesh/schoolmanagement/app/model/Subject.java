package com.deepesh.schoolmanagement.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subjectId;

	@Column(name = "subject_name")
	private String subjectName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	public Classes classes;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "subject")
	private List<Routine> routine = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "subject")
	private List<TestPaper> test = new ArrayList<>();

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public List<Routine> getRoutine() {
		return routine;
	}

	public void setRoutine(List<Routine> routine) {
		this.routine = routine;
	}

	public List<TestPaper> getTest() {
		return test;
	}

	public void setTest(List<TestPaper> test) {
		this.test = test;
	}

}
