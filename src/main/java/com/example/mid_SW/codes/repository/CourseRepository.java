package com.example.mid_SW.codes.repository;

import com.example.mid_SW.codes.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
