package schoolmanagementsystem;

public class Teacher extends Person {

    private int salary;
    public Teacher(int id,String name,int salary)
    {
        super(id, name);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

     /*
    Setter
    */

    public void setSalary(int salary) {
        this.salary = salary;
    }
    /*
    teacher receive salary
    */
    public void receivesalary(int salary){
        School.updateTotalMonySpent(salary);
    }
}
