package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Student;
import com.deepesh.schoolmanagement.app.model.StudentClass;



@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass, Long>{

	@Query("Select st from Student st, Classes clas, StudentClass sc where st.id=sc.student.id and clas.classId=sc.classes.classId and clas.classId=?1 ")
	List<Student> getStudentByClass(Long id);
	
	@Query("select st from StudentClass st where st.classes.classId=?1 and st.student.id=?2")
	StudentClass getIdByStudentandClass(Long id, Long student_id);
}
