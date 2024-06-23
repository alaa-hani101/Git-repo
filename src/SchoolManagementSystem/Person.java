package schoolmanagementsystem;

public class Person {
    private int id ;
    private String name;

    // constructor
    public Person ( int id, String name)
    {
        this.name=name;
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
