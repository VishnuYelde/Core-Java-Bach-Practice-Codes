public class Nivadnuk {
    public static void main(String[] args) {
        
        manus m1 = new manus("Rishi", 20, 'M');
        vidhyarthi v1 = new vidhyarthi("Ved", 21, 'M', 10, 75, "XYZ");
        kamgar k1 = new kamgar("Amaal", 30, 'M', "id101", 600000, 4);

        sarkar s1 = new sarkar();

        s1.AdharCard(m1);
        m1.mahiti();
        System.out.println("------------------------");
        s1.AdharCard(k1);
        k1.mahiti();
        System.out.println("------------------------");
        s1.AdharCard(v1);
        v1.mahiti();
        System.out.println("------------------------");
        s1.Scholarship(v1);
        // s1.Scholarship(k1);
        s1.TaxPayment(k1);

    }
}

class manus{
    String name;
    int age;
    char gender;

    manus (String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void mahiti(){
        System.out.println("Name of Manus is "+name+ " Age: "+age+ " Gender is "+ gender);
    }
}

class vidhyarthi extends manus{
    int rollno;
    double per;
    String college;


    vidhyarthi(String name, int age, char gender, int rollno, double per, String college){
        super(name, age, gender);
        this.rollno = rollno;
        this.per = per;
        this.college = college;

    }

    void mahiti(){
        System.out.println("Name of Vidhyarthi is "+name+ " Age: "+age+ " Gender is "+ gender+" Roll number is "+rollno+ " Percentage is "+ per+" name of college is "+college);
    }
}

class kamgar extends manus{
    String empid;
    int sal;
    int deptno;

    kamgar(String name, int age, char gender, String empid, int sal, int deptno){
        super(name, age, gender);
        this.empid = empid;
        this.sal = sal;
        this.deptno = deptno;

    }

    void mahiti(){
        System.out.println("Name of Kamgar is "+name+ " Age: "+age+ " Gender is "+ gender+" Employee ID is "+empid+ " Salary is "+ sal+" Department No is "+deptno);
    }
}

class sarkar{
    void AdharCard(manus m){
        System.out.println("Adhar given to the "+ m.name);
    }

    void Scholarship(vidhyarthi v){
        if(v.per > 70){
            System.out.println(v.name+" is eligible for Scholarship");
        }
        else{
            System.out.println("Study hard bacche");
        }
    }

    void TaxPayment(kamgar k){
        if(k.sal*12 >= 1200000){
            System.out.println(k.name+ " will pay tax, and the amount is "+k.sal*12*0.018+ "/- Only" );
        }
        else{
            System.out.println(k.name+" gareeb aahe");
        }
    }
}