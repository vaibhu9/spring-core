package com.springBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.AnnotationConfigApplicationContext;

import main.java.com.springBoot.Company;

@SpringBootApplication
public class ObjectDependencyApplication {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Company company= context.getBean("company",Company.class);
		company.showEmployee();
	}

}
