import java.util.Scanner;

//multiples of 3 and 5

public class FizzBuzz {
    public static void main(String[] args) 
    {
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter n : ");
            int n = s.nextInt();  
            fizzBuzz(n);
        };
    }

    public static void fizzBuzz(int n)
    {
        if (n%3 == 0 && n%5 == 0)
            System.out.println("FIZZBUZZ");
        else if (n%3 == 0)
            System.out.println("FIZZ");
        else if (n%5 == 0)
            System.out.println("BUZZ");
        else
            System.out.println(n);

    }
    

}
