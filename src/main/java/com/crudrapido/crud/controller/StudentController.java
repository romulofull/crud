package com.crudrapido.crud.controller;
import com.crudrapido.crud.entity.Student;
import com.crudrapido.crud.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private Studentservice Studentservice;

    @GetMapping
    public List<Student> getAll() {
        return Studentservice.getStudents();
    }
    @PostMapping
    public void saveOrUpdate(@RequestBody Student student) {
        Studentservice.saveOrUpdate(student);
    }

    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long studentId) {
        Studentservice.delete(studentId);
    }
    @GetMapping("/{studentId}")
    public Optional<Student> getStudentById(@PathVariable("studentId") Long studentId) {
        return Studentservice.getStudentById(studentId);
    }
}


