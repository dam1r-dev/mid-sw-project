package com.example.mid_SW.codes.dto;
import lombok.Data;
import java.util.List;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class TeacherDto {
    private Long id;
    private String name;
    private String email;
    private List<Long> courseIds;
}
