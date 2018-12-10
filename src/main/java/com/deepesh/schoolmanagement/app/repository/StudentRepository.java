package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select s, ut from Student s, userType ut where ut.userTypeId=s.userTypeId")
	public List<Student> getStudentWithType();
}
