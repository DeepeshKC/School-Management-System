package com.deepesh.schoolmanagement.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.ExamMarks;
import com.deepesh.schoolmanagement.app.model.Student;



@Repository
public interface ExamMarksRepository extends JpaRepository<ExamMarks, Long> {

	@Query("select em from ExamMarks em where em.exam.examId=?1 and em.class1.classId=?2")
	List<ExamMarks>getMarksByClass(Long id, Long class_id);
	@Query("Select marks from ExamMarks marks, Student st, Exam em where st.id=marks.student.id and em.examId=marks.exam.examId and em.examId=?1 and st.id=?2")
	Optional<ExamMarks> findByStudentAndClass(Long exam_id, Long student_id);

	List<ExamMarks> findByStudent(Student student);
}
