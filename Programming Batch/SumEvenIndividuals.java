import java.util.Scanner;

public class SumEvenIndividuals {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the no.:");
            int n = s.nextInt();

            SumEven(n);
        }
    }

    public static void SumEven(int n){
        int sum = 0;
        for( ; n>0 ; n/=10){
            int rem = n%10;

            if(n%2 ==0){
                sum = sum + rem;
            }
        }
        System.out.println("Sum of the even digits: " + sum);
    }
}
