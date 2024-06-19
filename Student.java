package school.managment.system;


public class Student {
   private int id;
   private String name;
   private double grade;
   private int level;
   private double paidfees; 
   private double totalfees;

    public Student(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.grade = 0;
        this.paidfees = 0;
        this.level=level;
        if(level<4)  // 1  2  3 
            this.totalfees=10000;
        else if(level>3 && level<7)   // 4  5  6
            this.totalfees=15000;
        else if(level >6 && level <10)             // 7 8 9
            this.totalfees=18000;
        else
            this.totalfees=20000;          // 10  11   12   
    } 
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public double getPaidfees() {
        return paidfees;
    }

    public double getTotalfees() {
        return totalfees;
    }
    public int getlevel() {
        return level;
    }
    /*
    Setter 
    */
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setPaidfees(int paidfees) {
        this.paidfees = paidfees;
    }

    public void setTotalfees(int totalfees) {
        this.totalfees = totalfees;
    }
    public void setlevel(int level) {
        this.level=level;
    }
    /*
                student pay fees
    */
   public void payfees(double fees){
       this.paidfees+=fees;
       this.totalfees-=fees;
       School.updateTotalMonyEarned(fees);
       
   }
           
    
    
    
    
}
