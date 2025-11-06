// This program checks if a given year is a leap year or not.
// A year is a leap year if it is divisible by 4, but not divisible by 100, unless it is also divisible by 400.


import java.util.Scanner;


public class leapyear {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)){

            System.out.println("Enter the year:");
            int n = s.nextInt();

            leapyr(n);
        }
    }

    public static void leapyr(int n){
        if (n%4 == 0 && n%100 != 0 || n%400 == 0){
            System.out.println(n + " is a leap year.");
        } else {
            System.out.println(n + " is not a leap year.");
        }
    }
}
