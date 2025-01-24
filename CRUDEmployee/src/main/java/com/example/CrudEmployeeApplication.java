package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.DBConfig;
import entities.Employee;
import service.EmployeeServiceImpl;

@SpringBootApplication
public class CrudEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudEmployeeApplication.class, args);

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class);
		EmployeeServiceImpl employeeService=(EmployeeServiceImpl)context.getBean("employeeService");
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("1.Insert");
			System.out.println("2:View");
			System.out.println("3:Delete by id");
			System.out.println("4:Update by id");
			System.out.println("5:Search by id");
			System.out.println("\nEnter your choice:");
			int choice=sc.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Enter name, email, contact:");
					sc.nextLine();
					String name=sc.nextLine();
					String email=sc.nextLine();
					String contact=sc.nextLine();

					Employee emp=new Employee();
					emp.setName(name);
					emp.setEmail(email);
					emp.setContact(contact);

					System.out.println((employeeService.isAddEmployee(emp))?"Employee added successfully...":"Sorry employee is not added...");
					break;

				case 2:
					List<Employee> list=employeeService.viewEmployee();
					if(list!=null){
						System.out.println("==================Employee Details==================");
						System.out.println("Id\tName\tEmail\t\t\tContact");
						System.out.println("==================================================");
						for(Employee e:list){
							System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact());
						}
					}
					else{
						System.out.println("Employee not present in database.");
					}
					break;

				case 3:
					System.out.println("Enter the employee id to delete:");
					int id=sc.nextInt();
					System.out.println((employeeService.isDeleteEmployee(id))?"Employee deleted successfully...":"Sorry Employee is not deleted...");
					break;

				case 4:
					System.out.println("Enter id, name, email, contact to update employee details:");
					id=sc.nextInt();
					sc.nextLine();
					name=sc.nextLine();
					email=sc.nextLine();
					contact=sc.nextLine();

					emp=new Employee();
					emp.setId(id);
					emp.setName(name);
					emp.setEmail(email);
					emp.setContact(contact);

					System.out.println((employeeService.isUpdateEmployee(emp))?"Employee updated successfully...":"Sorry employee is not updated...");
					break;


				case 5:
					System.out.println("Enter employee id to search details:");
					id=sc.nextInt();
					Employee e=employeeService.serachEmployeeById(id);
					if(e!=null){
						System.out.println("==================Employee Details==================");
						System.out.println("Id\tName\tEmail\t\t\tContact");
						System.out.println("==================================================");
						System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact());
					}
					else{
						System.out.println("Sorry Employee not found...");
					}
			
				default:
					break;
			}
		}while(true);

	}

}
