package com.deepesh.schoolmanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_intake")
public class Intake {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long intakeId;
	@Column(name = "intake")
	private String intake;
	public long getIntakeId() {
		return intakeId;
	}
	public void setIntakeId(long intakeId) {
		this.intakeId = intakeId;
	}
	public String getIntake() {
		return intake;
	}
	public void setIntake(String intake) {
		this.intake = intake;
	}


}
