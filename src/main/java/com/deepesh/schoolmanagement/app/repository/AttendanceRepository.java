package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Attendance;
import com.deepesh.schoolmanagement.app.model.Student;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	@Query("select s from Student s")
	List<Student> student(Long id);
}
