package com.deepesh.schoolmanagement.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Student;

@Repository
public interface AccountRepository extends JpaRepository<Student, Long>{
	@Query(value="select * from tbl_student where username=?1 and password=?2",nativeQuery=true)
	Student login(String username, String password);
}
