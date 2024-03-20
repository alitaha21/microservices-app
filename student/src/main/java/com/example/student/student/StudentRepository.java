package com.example.student.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<List<Student>> findAllBySchoolId(Integer schoolId);
}
