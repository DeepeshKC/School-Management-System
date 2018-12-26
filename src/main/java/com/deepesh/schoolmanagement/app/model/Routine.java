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
@Table(name = "tbl_routine")
public class Routine {

	@Id
	@Column(name = "routine_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long routineId;

	@Column(name = "first_period")
	private String firstPeriod;

	@Column(name = "second_period")
	private String secondPeriod;

	@Column(name = "third_period")
	private String thirdPeriod;

	@Column(name = "fourth_period")
	private String fourthPeriod;

	@Column(name = "fifth_period")
	private String fifthPeriod;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="class_id")
	private Classes classes;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Day day;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="subject_id")
	private Subject subject;

	public Long getRoutineId() {
		return routineId;
	}

	public void setRoutineId(Long routineId) {
		this.routineId = routineId;
	}

	public String getFirstPeriod() {
		return firstPeriod;
	}

	public void setFirstPeriod(String firstPeriod) {
		this.firstPeriod = firstPeriod;
	}

	public String getSecondPeriod() {
		return secondPeriod;
	}

	public void setSecondPeriod(String secondPeriod) {
		this.secondPeriod = secondPeriod;
	}

	public String getThirdPeriod() {
		return thirdPeriod;
	}

	public void setThirdPeriod(String thirdPeriod) {
		this.thirdPeriod = thirdPeriod;
	}

	public String getFourthPeriod() {
		return fourthPeriod;
	}

	public void setFourthPeriod(String fourthPeriod) {
		this.fourthPeriod = fourthPeriod;
	}

	public String getFifthPeriod() {
		return fifthPeriod;
	}

	public void setFifthPeriod(String fifthPeriod) {
		this.fifthPeriod = fifthPeriod;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	

}
