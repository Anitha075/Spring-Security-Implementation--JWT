package com.springSecurityImplementation;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Navin", 60),
            new Student(2, "Anu", 70)
    ));

    @GetMapping("/student")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
         return (CsrfToken) request.getAttribute("_csrf");

    }
}