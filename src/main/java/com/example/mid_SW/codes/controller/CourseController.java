package com.example.mid_SW.codes.controller;

import com.example.mid_SW.codes.dto.CourseDto;
import com.example.mid_SW.codes.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    @GetMapping
    public List<CourseDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public CourseDto getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public CourseDto create(@RequestBody CourseDto dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
