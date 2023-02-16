package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.smart.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
