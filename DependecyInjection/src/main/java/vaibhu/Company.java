package 
import main.java.springboot.Employee;

public class Company {

    @Autowired
    private Employee employee;

    public void setEmployee(Employee employee){
        this.employee=employee;
    }

    public void showEmployee(){
        System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getSalary);
    }
}
