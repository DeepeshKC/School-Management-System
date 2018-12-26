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
@Table(name = "tbl_day")
public class Day {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column(name = "day")
	private String day;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "day")
	private List<Routine> routine = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public List<Routine> getRoutine() {
		return routine;
	}

	public void setRoutine(List<Routine> routine) {
		this.routine = routine;
	}

}
