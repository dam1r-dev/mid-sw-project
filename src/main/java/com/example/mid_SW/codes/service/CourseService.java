package com.example.mid_SW.codes.service;

import com.example.mid_SW.codes.dto.CourseDto;
import com.example.mid_SW.codes.mapper.CourseMapper;
import com.example.mid_SW.codes.model.Course;
import com.example.mid_SW.codes.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repository;
    private final CourseMapper mapper;

    public List<CourseDto> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    public CourseDto getById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    public CourseDto save(CourseDto dto) {
        Course course = mapper.toEntity(dto);
        return mapper.toDto(repository.save(course));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
