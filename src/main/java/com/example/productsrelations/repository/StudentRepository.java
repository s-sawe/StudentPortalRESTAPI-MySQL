package com.example.productsrelations.repository;

import com.example.productsrelations.dto.RegistrationResponse;
import com.example.productsrelations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository <Student, Integer> {

    @Query("SELECT new com.example.productsrelations.dto.RegistrationResponse(s.name, c.courseName, c.payments)" +
            " FROM Student s JOIN s.courses c")
    public List<RegistrationResponse> getJoinInformation();
}
