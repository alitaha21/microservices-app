package com.example.school.school;

import java.util.List;

public class FullSchoolResponse {

    private String name;
    private String email;
    List<Student> students;

    public FullSchoolResponse() {
    }

    public FullSchoolResponse(String name, String email, List<Student> students) {
        this.name = name;
        this.email = email;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "FullSchoolResponse{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", students=" + students +
                '}';
    }
}
