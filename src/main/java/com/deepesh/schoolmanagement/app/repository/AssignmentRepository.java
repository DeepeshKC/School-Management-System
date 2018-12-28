package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
	
	@Query("select r from Assignment r where r.classes.classId=(select max(att.classes.classId) from StudentClass att where att.student.id=?1)")
	List<Assignment>findAssignmentByStudentId(Long id);
}
