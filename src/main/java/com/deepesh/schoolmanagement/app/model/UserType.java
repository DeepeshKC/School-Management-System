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
@Table(name = "tbl_userType")
public class UserType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long userTypeId;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "userType")
	private List<Teacher> teachers = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "userType")
	private List<Student> students = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "userType")
	private List<AdministrativeStaff> administrativeStaff = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "userType")
	private List<Parent> parents = new ArrayList<>();

	@Column(name = "userType")
	private String userType;

	public long getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(long userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<AdministrativeStaff> getAdministrativeStaff() {
		return administrativeStaff;
	}

	public void setAdministrativeStaff(List<AdministrativeStaff> administrativeStaff) {
		this.administrativeStaff = administrativeStaff;
	}

	public List<Parent> getParents() {
		return parents;
	}

	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}
}