package com.example.mid_SW.codes.mapper;

import com.example.mid_SW.codes.dto.StudentDto;
import com.example.mid_SW.codes.model.Student;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto toDto(Student student);
    Student toEntity(StudentDto dto);
    List<StudentDto> toDtoList(List<Student> students);
}
