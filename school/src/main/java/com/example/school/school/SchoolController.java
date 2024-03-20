package com.example.school.school;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping
    public ResponseEntity<String> saveSchool(@RequestBody School school) {
        schoolService.saveSchool(school);
        return ResponseEntity.accepted().body("Created");
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.accepted().body(schoolService.findAllSchools());
    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllStudents(@PathVariable("school-id") Integer schoolId) {
        return ResponseEntity.accepted().body(schoolService.findSchoolsWithStudents(schoolId));
    }
}
