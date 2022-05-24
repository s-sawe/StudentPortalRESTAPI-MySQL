package com.example.productsrelations.repository;

import com.example.productsrelations.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository <Course, Integer> {
}
