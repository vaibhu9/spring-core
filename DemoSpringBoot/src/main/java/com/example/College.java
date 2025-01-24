package com.example;

import org.springframework.beans.factory.annotation.*;

public class College {
    
    @Autowired
    private Student student;

    public void setStudent(Student student){
        this.student=student;
        System.out.println("Student object injected successfully...");
    }

    public void showStudent(){
        System.out.println(student.getId()+" "+student.getName());
    }
}
