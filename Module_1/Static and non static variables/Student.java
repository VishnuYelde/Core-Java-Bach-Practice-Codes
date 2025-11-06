
public class Student {

    int id;
    String name;
    static String college = "SSJCOE";

    public void Display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("College: " + Student.college);
        System.out.println(college);
    }

    public static void main(String[] args) {
        System.out.println(college);
        System.out.println(Student.college);

        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.college);
    }
}
