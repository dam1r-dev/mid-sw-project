package com.example.mid_SW.codes.dto;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CourseDto {
    private Long id;
    private String title;
    private int credits;
    private Long teacherId;
}
