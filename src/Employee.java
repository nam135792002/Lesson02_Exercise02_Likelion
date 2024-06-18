public class Employee {
    protected long salary;

    public Employee(long salary) {
        this.salary = salary;
    }

    public Employee() {}

    public void work(){
        System.out.println("Working as an employee!");
    }

    public void getSalary(){
        System.out.println("Salary: " + this.salary);
    }
}
