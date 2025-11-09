public class Government {
    void adhaarCard(Person p){
        System.out.println(p.name+ " Will get Adhaar Card.");
    }

    void Scholarship(Student s){
        if(s.per > 75){
            System.out.println(s.name+ " Will get Scholarship.");
        }
        else{
            System.out.println("Study hard bacche");
        }
    }
    void taxPayment(Employee e){
        if(e.sal*12 >= 1200000){
            System.out.println(e.name+ " should pay tax.");
            System.out.println("Tax payable amount is " + e.sal*12*0.18 + "/- only.");
        }
        else{
            System.out.println("Main gareeb hoo aur gareeb se tax nahi lete.");
        }
    }
}
