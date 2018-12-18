package com.deepesh.schoolmanagement.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Admin;
import com.deepesh.schoolmanagement.app.model.AdministrativeStaff;
import com.deepesh.schoolmanagement.app.model.Parent;
import com.deepesh.schoolmanagement.app.model.Student;
import com.deepesh.schoolmanagement.app.model.Teacher;

@Repository
public interface AccountRepository extends JpaRepository<Student, Long>{
	@Query("select s from Student s where s.username=?1 and s.password=?2")
	Student loginStudent(String username, String password);
	
	@Query("select s from Teacher s where s.username=?1 and s.password=?2")
	Teacher loginTeacher(String username, String password);
	
	@Query("select s from Parent s where s.username=?1 and s.password=?2")
	Parent loginParent(String username, String password);
	
	@Query("select s from AdministrativeStaff s where s.username=?1 and s.password=?2")
	AdministrativeStaff loginAdministrativeStaff(String username, String password);
	
	@Query("select s from Admin s where s.username=?1 and s.password=?2")
	Admin loginAdmin(String username, String password);
}
