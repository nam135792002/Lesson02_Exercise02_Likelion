public class HRManager extends Employee{

    public HRManager(long salary){
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("Managing employees!");
    }

    public void addEmployee(){
        System.out.println("Adding new employee!");
    }
}
