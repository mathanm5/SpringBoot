package com.maddy.SpringJDBC.service;


import com.maddy.SpringJDBC.model.Student;
import com.maddy.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    private StudentRepo repo;

    public void addStudent(Student s){

        repo.save(s);


        System.out.println("Added Success..");


    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
