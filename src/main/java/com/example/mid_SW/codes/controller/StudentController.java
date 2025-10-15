package com.example.mid_SW.codes.controller;

import com.example.mid_SW.codes.dto.StudentDto;
import com.example.mid_SW.codes.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<StudentDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public StudentDto create(@RequestBody StudentDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public StudentDto update(@PathVariable Long id, @RequestBody StudentDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
