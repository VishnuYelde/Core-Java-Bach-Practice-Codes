import java.util.Scanner;

public class RemoveLastDigit {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int n = s.nextInt();

            NaturalNum(n);
        }
        
    }


    public static void NaturalNum(int n){
        int num = n/10;
        System.out.println("The number after removing the last digit is: " + num);
    }
}