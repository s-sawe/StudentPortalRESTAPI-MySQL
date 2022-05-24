package com.example.productsrelations.controller;

import com.example.productsrelations.dto.RegistrationRequest;
import com.example.productsrelations.dto.RegistrationResponse;
import com.example.productsrelations.entity.Student;
import com.example.productsrelations.repository.CourseRepository;
import com.example.productsrelations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/placeRegistration")
    public Student createRegistration(@RequestBody RegistrationRequest request){
      return studentRepository.save(request.getStudent());
    }
    @GetMapping("/findAllCourses")
    public List<Student> findAllCourses(){

        return studentRepository.findAll();
    }
    @GetMapping("/findAll")
    public List<RegistrationResponse> getJoinInformation(){

        return studentRepository.getJoinInformation();
    }
}
