public class MethodOverriding {
    
    public void Captaincy(){
        System.out.println("Dhoni was Captain till 2015.");
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.Captaincy();

        // child obj2 = new child();
        // obj2.Captaincy();
    }
}


