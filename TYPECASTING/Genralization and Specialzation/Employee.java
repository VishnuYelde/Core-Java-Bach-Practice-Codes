public class Employee extends Person {

    String empId;
    double sal;
    int deptno;

    public Employee(String name, int age, char gender, String empId, double sal, int deptno) {
        super(name, age, gender);
        this.empId = empId;
        this.sal = sal;
        this.deptno = deptno;
    }

    void jankari(){
        System.out.println("Employee name in "+ name+ " Age is "+ age+ " Gender is "+gender+ "EmpId is "+empId+ " Salary is "+ sal+ " Department no. is " + deptno);
    }
    
}
