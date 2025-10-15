package com.example.mid_SW.codes.repository;

import com.example.mid_SW.codes.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
