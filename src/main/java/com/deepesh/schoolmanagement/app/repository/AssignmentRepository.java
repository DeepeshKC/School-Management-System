package com.deepesh.schoolmanagement.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {

}
