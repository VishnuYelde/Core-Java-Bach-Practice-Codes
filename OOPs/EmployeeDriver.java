import java.util.Scanner;

class Employee {
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void work(){
        System.out.println("Employee is working...");
    }

    public void displayDetails(){
        System.out.println("=======Displaying employee details=====");
        System.out.println("ID : " + this.id);
        System.out.println("NAME : " + this.name);
        System.out.println("SALARY : " + this.sal);
    }
}

public class EmployeeDriver{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter id : ");
        int id = s.nextInt();
        s.nextLine();  //returns the input that was skipped (Name will skip if not written)
        System.out.print("Enter name : ");
        String name = s.nextLine();
        System.out.print("Enter salary : ");
        double sal = s.nextDouble();

        Employee e1 = new Employee(id, name, sal);

        e1.displayDetails();
        s.close();
    }
}
