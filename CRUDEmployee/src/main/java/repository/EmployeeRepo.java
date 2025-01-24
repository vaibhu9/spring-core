package repository;

import java.util.List;

import entities.Employee;

public interface EmployeeRepo {

    public boolean isAddEmployee(Employee employee);
    public List<Employee> viewEmployee();
    public boolean isDeleteEmployee(Object obj);
    public boolean isUpdateEmployee(Employee employee);
    public Employee serachEmployeeById(Object obj);
    
}
