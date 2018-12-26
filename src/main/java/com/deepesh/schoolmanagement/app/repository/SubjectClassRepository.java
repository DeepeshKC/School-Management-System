package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Subject;
import com.deepesh.schoolmanagement.app.model.SubjectClass;

@Repository
public interface SubjectClassRepository extends JpaRepository<SubjectClass, Long> {

	@Query("Select subject from Subject subject,Parent p, Student st, Classes clas, SubjectClass sc, StudentClass stu where st.id=p.student.id and  st.id=stu.student.id and clas.classId=stu.classes.classId and subject.subjectId=sc.subject.subjectId and clas.classId=sc.classes.classId and p.id=?1")
	List<Subject> getSubjectByStudent(Long parentId);

}
