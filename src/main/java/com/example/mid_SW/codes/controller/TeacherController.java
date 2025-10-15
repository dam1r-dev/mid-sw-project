package com.example.mid_SW.codes.controller;

import com.example.mid_SW.codes.dto.TeacherDto;
import com.example.mid_SW.codes.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService service;

    @GetMapping
    public List<TeacherDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TeacherDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public TeacherDto create(@RequestBody TeacherDto dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
