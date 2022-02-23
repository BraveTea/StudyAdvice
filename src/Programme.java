

public class Programme {

    public static void main(String[] args){
        System.out.println("config");

        Student s1 = new Student("Alex");
        Student s2 = new Student("Sander");
        Student s3 = new Student("Geert");

        System.out.println(s2.getStudentNum());
        System.out.println(Student.getNumberOfStudents());
    }
}
