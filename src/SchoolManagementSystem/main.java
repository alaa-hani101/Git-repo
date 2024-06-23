package schoolmanagementsystem;

import java .util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Student s1=new Student(1,"Alaa",6);
        Student s2=new Student(2,"Mohammed",7);
        Student s3=new Student(3,"Mahmoud",11);

        List<Student> students=new ArrayList<>();
        students.add(s1);      students.add(s2);          students.add(s3);

        Teacher t1=new Teacher(1,"Hani",7000);
        Teacher t2=new Teacher(2,"Nora",3500);
        Teacher t3=new Teacher(3,"Nadia",4000);


        List<Teacher> teachers =new ArrayList<>();
        teachers.add(t1);      teachers.add(t2);          teachers.add(t3);

        School sc1=new School (teachers,students);
        /*
        student Alaa pay half of total fees
        */
        s1.payfees(s1.getTotalfees() / 2);
        /*
        student mohammed pay hos total fees
        */
        s2.payfees(s2.getTotalfees());

        System.out.println( s1.getPaidfees());
       /*
       cheack total mony earned of school
       */
        System.out.println(sc1.getTotalMonyEarned());

        /*
         * school pay salary to teacher Hani
         * cheack total mony
         */
        t1.receivesalary(t1.getSalary());
        System.out.println(sc1.getTotalMonyEarned());




    }
}
