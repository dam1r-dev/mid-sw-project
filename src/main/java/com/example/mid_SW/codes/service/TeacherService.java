package com.example.mid_SW.codes.service;

import com.example.mid_SW.codes.dto.TeacherDto;
import com.example.mid_SW.codes.mapper.TeacherMapper;
import com.example.mid_SW.codes.model.Teacher;
import com.example.mid_SW.codes.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository repository;
    private final TeacherMapper mapper;

    public List<TeacherDto> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    public TeacherDto getById(Long id) {
        return repository.findById(id).map(mapper::toDto).orElse(null);
    }

    public TeacherDto save(TeacherDto dto) {
        Teacher teacher = mapper.toEntity(dto);
        return mapper.toDto(repository.save(teacher));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
