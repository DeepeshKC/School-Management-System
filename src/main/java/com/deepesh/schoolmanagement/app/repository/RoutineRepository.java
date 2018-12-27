package com.deepesh.schoolmanagement.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.Routine;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {

	
@Query("select r from Routine r where r.classes.classId=?1")
List<Routine> findRoutineByClassId(Long id);

@Query("select r from Routine r where r.classes.classId=(select max(att.classes.classId) from StudentClass att where att.student.id=?1 )")
List<Routine>findRoutineByStudentId(Long id);
}

