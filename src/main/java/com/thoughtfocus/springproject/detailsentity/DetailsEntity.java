package com.thoughtfocus.springproject.detailsentity;

import lombok.*;

import javax.persistence.*;
@NoArgsConstructor
@Getter
@Setter
@Table(name="studentDetailsNew")
@Entity
public class DetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int  age;
    private String gender;
}
