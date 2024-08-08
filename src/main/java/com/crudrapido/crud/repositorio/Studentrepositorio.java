package com.crudrapido.crud.repositorio;

import com.crudrapido.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentrepositorio extends JpaRepository<Student, Long> {
    List<Student> findByStudentId(Long studentId);
}
