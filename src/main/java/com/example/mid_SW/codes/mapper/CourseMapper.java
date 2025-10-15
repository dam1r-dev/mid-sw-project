package com.example.mid_SW.codes.mapper;

import com.example.mid_SW.codes.dto.CourseDto;
import com.example.mid_SW.codes.model.Course;
import com.example.mid_SW.codes.model.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    @Mapping(target = "teacherId", source = "teacher.id")
    CourseDto toDto(Course course);

    @Mapping(target = "teacher", expression = "java(dto.getTeacherId() != null ? new Teacher(dto.getTeacherId(), null, null, null) : null)")
    Course toEntity(CourseDto dto);
}
