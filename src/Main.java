public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(40000);
        employee.work();
        employee.getSalary();

        System.out.println("*************************************");

        HRManager hr = new HRManager(70000);
        hr.work();
        hr.getSalary();
        hr.addEmployee();

    }
}