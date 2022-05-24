package com.example.productsrelations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
//@Table(name="Course")
public class Course {

    @Id
    private int cid;
    private String courseName;
    private int units;
    private int payments;

}
