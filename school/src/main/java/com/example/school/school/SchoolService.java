package com.example.school.school;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public SchoolService(SchoolRepository schoolRepository, StudentClient studentClient) {
        this.schoolRepository = schoolRepository;
        this.studentClient = studentClient;
    }

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId).orElse(new School("NOT_FOUND", "NOT_FOUND"));
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return new FullSchoolResponse(school.getName(), school.getEmail(), students);
    }
}
