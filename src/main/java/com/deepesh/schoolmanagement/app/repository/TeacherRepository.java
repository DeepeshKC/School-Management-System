package com.deepesh.schoolmanagement.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Teacher;

@Repository

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
