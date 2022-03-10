package com.thoughtfocus.springproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
    private int id;
    private String  name;
    private String email;
    private int age;
}
