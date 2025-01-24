package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Employee;
import repository.EmployeeRepo;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public boolean isAddEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeRepo.isAddEmployee(employee);
    }

    @Override
    public List<Employee> viewEmployee() {
        // TODO Auto-generated method stub
        return employeeRepo.viewEmployee();
    }

    @Override
    public boolean isDeleteEmployee(Object obj) {
        // TODO Auto-generated method stub
        return employeeRepo.isDeleteEmployee(obj);
    }

    @Override
    public Employee serachEmployeeById(Object obj) {
        // TODO Auto-generated method stub
        return employeeRepo.serachEmployeeById(obj);
    }

    @Override
    public boolean isUpdateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeRepo.isUpdateEmployee(employee);
    }
    
}
