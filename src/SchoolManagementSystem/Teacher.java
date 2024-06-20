package SchoolManagementSystem;

public class Teacher {
    private int id ;
    private String name;
    private int salary;
    public Teacher(int id,String name,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    // setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

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
