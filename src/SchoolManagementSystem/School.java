package schoolmanagementsystem;

import java.util.List;


    public  class School {
        private List<Teacher> teachers;
        private List<Student> students;
        private static double TotalMonyEarned;
        private static double TotalMonySpent;

        public School(List<Teacher> teachers, List<Student> students) {
            this.teachers = teachers;
            this.students = students;
            this.TotalMonyEarned=0;
            this.TotalMonySpent=0;
        }

        public static  double getTotalMonyEarned() {
            return TotalMonyEarned;
        }

        public static double getTotalMonySpent() {
            return TotalMonySpent;
        }

        public static void updateTotalMonyEarned(double MonyEarned) {
            School.TotalMonyEarned += MonyEarned;
        }

        public static void updateTotalMonySpent(double MonySpent) {
            if(School.TotalMonyEarned>0)
                School.TotalMonyEarned -= MonySpent;
            School.TotalMonySpent+=MonySpent;
        }
        /*
           now how much mony school has ?
        */
        public double RemainMony()
        {
            return School.TotalMonyEarned-School.TotalMonySpent;
        }
        /*
        teachers and students
        */
        public List<Teacher> getTeachers() {
            return teachers;
        }

        public List<Student> getStudents() {
            return students;
        }

        public  void addTeachers(Teacher teacher) {
            teachers.add(teacher);
        }

        public  void addStudents(Student student) {
            students.add(student);
        }



    }

