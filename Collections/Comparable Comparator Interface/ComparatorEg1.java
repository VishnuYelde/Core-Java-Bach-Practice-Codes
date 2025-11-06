import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEg1 {
    public static void main(String[] args) {
        Student s1 = new Student("Vishnu", 25, 22);
        Student s2 = new Student("Vishal", 30, 23);
        Student s3 = new Student("Yash", 20, 24);

        SortingByName sortName = new SortingByName();
        SortingByRollNo sortRollno = new SortingByRollNo();
        SortingByAge sortAge = new SortingByAge();

        // Sorting by Name
        System.out.println("Sorting by Name");
        TreeSet<Student> set1 = new TreeSet<>(sortName);
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);

        for (Student student : set1) {
            System.out.println("Student 1: " + student);
        }
        System.out.println("---------------------------");

        // Sorting by RollNo
        System.out.println("Sorting by RollNo");
        TreeSet<Student> set2 = new TreeSet<>(sortRollno);
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);

        for (Student student : set2) {
            System.out.println("Student 2: " + student);
        }
        System.out.println("---------------------------");
        
        // Sorting by Age
        System.out.println("Sorting by Age");
        TreeSet<Student> set3 = new TreeSet<>(sortAge);
        set3.add(s1);
        set3.add(s2);
        set3.add(s3);

        for (Student student : set3) {
            System.out.println("Student 3: " + student);
        }
        System.out.println("---------------------------");

    }
}
class Student{

    String name;
    int rollno;
    int age;

    public Student(String name, int rollno, int  age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public String toString(){
        return "Student Name: "+name+" RollNo: "+rollno+" Age: "+age;
    }
}

class SortingByName implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}

class SortingByRollNo implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.rollno - b.rollno;
    }
}

class SortingByAge implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.age - b.age;
    }
}
