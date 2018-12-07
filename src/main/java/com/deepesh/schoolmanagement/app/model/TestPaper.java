package com.deepesh.schoolmanagement.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_result")
public class TestPaper {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public long testpaperId;

	@Column(name = "test_paper_name")
	private String testpaperName;

}
