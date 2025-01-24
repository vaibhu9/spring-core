package com.example;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    private int id;

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

    private String name;
}
