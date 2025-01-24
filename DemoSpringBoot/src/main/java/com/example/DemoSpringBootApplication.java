package com.example;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
		System.out.println("Hyyy");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		College college=context.getBean("college",College.class);
		college.showStudent();
	}

}
