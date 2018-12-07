package com.deepesh.schoolmanagement.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepesh.schoolmanagement.app.model.UserType;

@Repository

public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
