package com.deepesh.schoolmanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_university")
public class University {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long universityId;
	
	@Column(name="name")
	private String name;
}
