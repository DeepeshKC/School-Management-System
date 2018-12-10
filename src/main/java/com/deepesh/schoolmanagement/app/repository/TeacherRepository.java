package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Teacher;

@Repository

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	@Query("select t, u from Teacher t, UserType u where u.userTypeId=t.userType")
	public List<Teacher> getTeacherWithType();
}
