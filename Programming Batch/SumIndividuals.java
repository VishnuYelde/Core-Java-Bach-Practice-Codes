import java.util.Scanner;

public class SumIndividuals {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter Number:");
            int n = s.nextInt();

            SumNumber(n);
        }
    }


    public static void SumNumber(int n){
        int sum = 0;
        for( ;n > 0; n/=10){
            int rem = n%10;
            sum += rem;

        }
        System.out.println("The sum of the individual digits is: " + sum);
    }
}
