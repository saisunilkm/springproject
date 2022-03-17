package com.thoughtfocus.springproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UpdateStudentAgeDto {
    private int id;
    private int age;
}
