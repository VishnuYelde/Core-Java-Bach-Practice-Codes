import java.util.Scanner;

public class PrimeSwitch {

    public static void main(String[] args) {
        System.out.println("1. Check whether the number is prime or not.");
        System.out.println("2. Find the prime numbers within given range.");
        System.out.println("Enter the choice: ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int a = s.nextInt();
                System.out.println((Prime(a)? a+" is Prime No":"Not a Prime no."));
                break;
            case 2:
                System.out.println("Enter the range: ");
                int c = s.nextInt();
                int d = s.nextInt();
                PrimeRange(c, d);
                break;
            default:
                System.out.println("Invalid Input (Please Enter choice 1 or 2).");
                break;
        }
        s.close();
    }

    public static boolean Prime(int a) {
        if (a <= 1) return false;
        if (a == 2 || a == 3) return true;
        if (a % 2 == 0 || a % 3 == 0) return false;

        for(int i = 5; i*i < a; i+=6){
            if(a % i == 0 || a % (i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeRange(int a, int b){
        System.out.println("Prime numbers: ");

        for(int i = a; i <= b; i++){
            if(Prime(i)) {
                System.out.println(i);
            }
        }
    }
}
