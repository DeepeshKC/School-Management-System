package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

	@Query("Select res from Resource res where res.teacher.teacherId=?1")
	List<Resource>findByTeacherId(Long id);

}
