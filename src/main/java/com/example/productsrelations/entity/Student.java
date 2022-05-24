package com.example.productsrelations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
//@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cs_fk", referencedColumnName = "id")
    private List<Course> courses;


}
