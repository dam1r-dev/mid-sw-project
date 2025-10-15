package com.example.mid_SW.codes.service;

import com.example.mid_SW.codes.model.Student;
import com.example.mid_SW.codes.dto.StudentDto;
import java.util.List;

public interface StudentService {
    List<StudentDto> getAll();
    StudentDto getById(Long id);
    StudentDto create(StudentDto dto);
    StudentDto update(Long id, StudentDto dto);
    void delete(Long id);
}
