import java.util.*;

public class PrintIndividual {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter Number:");
            int n = s.nextInt();

            Number(n);
        }
    }

    // public static void Number(int n){
    //     for( ; n > 0; n/=10){
    //         System.out.println(n%10);
    //     }
        
    // }

    public static void Number(int n){
        ArrayList<Integer> a = new ArrayList<>();
        while (n > 0) {
            int r = n%10;
            System.out.println(r);
            a.add(r);
            n = n/10;
        }
        Collections.reverse(a);
        System.out.println(a);
    }
}
