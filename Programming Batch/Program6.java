// Q. given 2 int values, return true if one is negative and one is positive. expect if the parameter "negative" is true, the return true only if both are negative.
// posNeg(1, -1, false)-->true 
// posNeg(-1, 1, false)-->true
// posNeg(-4, -5, true)-->true

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        
        int a;
        int b;
        boolean negative;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the values of a and b: ");
            a = s.nextInt();
            b = s.nextInt();
            System.out.println("Enter the boolean value: ");
            negative = s.nextBoolean();
        }
        System.out.println("Resultin boolean:" + posNeg(a, b, negative));
    }


    public static boolean posNeg(int a, int b, boolean negative){
        if (negative){
            return a<0 && b<0;
        }
        else{
            return(a>0 && b<0) || (a<0 && b>0);
        }

        // if(negative == true && a<0 && b<0) {
        //     return true;
        // }
        // else if((a>0 && b<0 && negative == false) || (a<0 && b>0 && negative == false)) {
        //     return true;
        // }

        // return false;
    }
}