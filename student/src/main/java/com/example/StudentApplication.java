package com.example;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import main.java.com.example.College;


public class StudentApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StudentApplication.class, args);

		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		College college=context.getBean("college",College.class);
		college.showStudent();
	}

}
