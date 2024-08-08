package com.crudrapido.crud.service;

import com.crudrapido.crud.entity.Student;
import com.crudrapido.crud.repositorio.Studentrepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentservice {
    @Autowired
    Studentrepositorio Studentrepositorio;

    public List<Student> getStudents(){
    return Studentrepositorio.findAll();
}
    public Optional<Student> getStudentById(Long studentId){
        return Studentrepositorio.findById(studentId);
}
public void saveOrUpdate(Student student) {
Studentrepositorio.save(student);
}
    public void delete(Long studentId) {
        Studentrepositorio.deleteById(studentId);
}}

