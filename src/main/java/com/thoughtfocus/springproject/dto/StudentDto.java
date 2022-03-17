package com.thoughtfocus.springproject.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class StudentDto {
    private int id;
    private String name;
    private String email;
    private int age;
}
