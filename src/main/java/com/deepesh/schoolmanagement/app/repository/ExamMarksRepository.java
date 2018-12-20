package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.ExamMarks;



@Repository
public interface ExamMarksRepository extends JpaRepository<ExamMarks, Long> {

	@Query("select em from ExamMarks em where em.exam.examId=?1 and em.class1.classId=?2")
	List<ExamMarks>getMarksByClass(Long id, Long class_id);
}
