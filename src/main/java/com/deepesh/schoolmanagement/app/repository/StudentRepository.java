package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Parent;
import com.deepesh.schoolmanagement.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select p from Parent p where p.parentId=?1")
	List<Parent> getStudentbyParent(Long parentId);
}
