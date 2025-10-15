package com.example.mid_SW.codes.mapper;

import com.example.mid_SW.codes.dto.TeacherDto;
import com.example.mid_SW.codes.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    @Mapping(
            target = "courseIds",
            expression = "java(teacher.getCourses() != null ? teacher.getCourses().stream().map(c -> c.getId()).collect(java.util.stream.Collectors.toList()) : null)"
    )
    TeacherDto toDto(Teacher teacher);

    @Mapping(target = "courses", ignore = true)
    Teacher toEntity(TeacherDto dto);

    List<TeacherDto> toDtoList(List<Teacher> teachers);
}
