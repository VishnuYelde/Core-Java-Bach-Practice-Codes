import java.util.Scanner;

public class ProductIndividuals {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the no.: ");
            int n = s.nextInt();
            
            
            ProductNum(n);
        }

    }

    public static void ProductNum(int n){
        int prod = 1;
        for( ; n > 0; n/=10){
            int rem = n%10;
            prod = prod * rem;
        }
        System.out.println("Product of the digits: " + prod);
    }
}
