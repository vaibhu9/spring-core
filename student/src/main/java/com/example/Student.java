package main.java.com.example;

import org.springframework.context.annotaion.*;

public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @Value("1")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Value("Vaibhav")
    public void setName(String name) {
        this.name = name;
    }

}
