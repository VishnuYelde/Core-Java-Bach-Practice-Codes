import java.util.Scanner;

public class CustomExcep4 {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter No.: ");
            int n = s.nextInt();

            if(n > 0){
                System.out.println("No. is Positive");
            }
            else{
                throw new NumberIsNegative();
            }
        }
        catch(NumberIsNegative e){
            System.out.println(e.getMessage());
        }
    }
}

class NumberIsNegative extends Exception{
    
    public String getMessage(){
        return "Negative no. Not Allowed";
    }
}
