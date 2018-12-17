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
@Table(name = "tbl_class")
public class Classes {
	@Id
	@Column(name="class_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long classId;
	
	
	@Column(name = "class_name")
	private String className;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<Subject> subject = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes1")
	private List<QuestionPaper> questionpaper = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "classes")
	private List<StudentClass> studentClass1 = new ArrayList<>();


	public long getClassId() {
		return classId;
	}

	public void setClassId(long classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<QuestionPaper> getQuestionpaper() {
		return questionpaper;
	}

	public void setQuestionpaper(List<QuestionPaper> questionpaper) {
		this.questionpaper = questionpaper;
	}

	public List<StudentClass> getStudentClass1() {
		return studentClass1;
	}

	public void setStudentClass1(List<StudentClass> studentClass1) {
		this.studentClass1 = studentClass1;
	}

	
}
