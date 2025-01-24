package main.java.com.example;

import org.springframework.context.annotaion.*;

public class College {
    
    @Autowired
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void showStudent(){
        System.out.println(student.getId()+" "+student.getName());
    }
    
}
