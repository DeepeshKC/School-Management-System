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
@Table(name = "tbl_university")
public class University {

	@Id
	@Column(name="university_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long universityId;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "university")
	private List<UniversityStudent> universityStudent = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "university")
	private List<Student> student = new ArrayList<>();
	
	
	public Long getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<UniversityStudent> getUniversityStudent() {
		return universityStudent;
	}

	public void setUniversityStudent(List<UniversityStudent> universityStudent) {
		this.universityStudent = universityStudent;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

}
