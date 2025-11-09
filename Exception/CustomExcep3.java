import java.util.Scanner;

public class CustomExcep3 {
    private static double bal = 15000;

    public static void withdraw(int amt) throws InsufficientBalance{

        if(amt > bal){
            throw new InsufficientBalance("Low Balance");
        }
        bal -= amt;
        System.out.println(amt + " Withdraw Successfully\n Available Balance: " + bal);
        
    }

    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Withdraw Amount: ");
            int amt = s.nextInt();
            withdraw(amt);
            
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());  
            System.out.println("Transaction Failed");
        }
    }
}

class InsufficientBalance extends Exception{
    public InsufficientBalance(String message){
        super(message);
    }
}
