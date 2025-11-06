import java.util.Scanner;

public class CustomExcep2 {
    public static void main(String[] args) {
        System.out.println("---Main Start---");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        s.close();

        if(age >= 18){
            System.out.println("You are Eligible for voting.");
        }
        else{
            try {
                throw new MinorException();

                //! This can also possible
                // MinorException m1 = new MinorException();
                // throw m1;
                
            } catch (MinorException m) {
                System.out.println(m.getMessage());
                // m.printStackTrace();
            }
        }
        System.out.println("---Main End---");
    }
}
// Unchecked Exception
class MinorException extends RuntimeException{
    public String getMessage(){
        return "Aare ajun tu andyat aahe re";
    }
}
