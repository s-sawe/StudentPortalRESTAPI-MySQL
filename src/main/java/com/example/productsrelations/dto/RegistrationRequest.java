package com.example.productsrelations.dto;

import com.example.productsrelations.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RegistrationRequest {
    private Student student;

}
