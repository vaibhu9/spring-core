package vaibhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotaionConfigApplicationContext;

import main.java.Company;

@SpringBootApplication
public class DependecyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependecyInjectionApplication.class, args);

		AnnotationConfigApplicationContext context=new AnnotaionConfigApplicationContext(Config.class);
		Company company=context.getBean("company",Company.class);
		company.showEmployee();
	}

}
