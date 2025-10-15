package com.example.mid_SW.codes.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int credits;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}
