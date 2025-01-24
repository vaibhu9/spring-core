public class Employee {
    private int id;
    private String name;
    private int salary;

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

    @Value("Vaibhav Shejol")
    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    @Value("10000")
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
