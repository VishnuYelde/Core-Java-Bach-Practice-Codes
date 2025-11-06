public class Student extends Person {
    int rollno;
    double per;
    String college;

    public Student(String name, int age, char gender, int rollno, double per, String college){
        super(name, age, gender);
        this.rollno = rollno;
        this.per = per;
        this.college = college;
    }

    void jankari(){
        System.out.println("Student name in "+ name+ " Age is "+ age+ " Gender is "+gender+ " Roll no is "+rollno+ " Percentage is "+ per+ " College name is " + college);
    }
}
