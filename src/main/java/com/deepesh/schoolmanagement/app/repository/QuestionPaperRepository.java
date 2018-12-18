package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.QuestionPaper;

@Repository
public interface QuestionPaperRepository extends JpaRepository<QuestionPaper, Long> {

	//@Query("select q from QuestionPaper q, Classes c where c.classId=q.classes1.id and c.classId=?1")
	//List<QuestionPaper> question(Long id);
	
	@Query("from QuestionPaper")
	List<QuestionPaper> question();
}
