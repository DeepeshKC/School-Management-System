package com.deepesh.schoolmanagement.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.TeacherClass;

@Repository
public interface TeacherClassRepository extends JpaRepository<TeacherClass, Long>  {

}
