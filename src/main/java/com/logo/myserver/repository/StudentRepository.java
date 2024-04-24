package com.logo.myserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.logo.myserver.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
