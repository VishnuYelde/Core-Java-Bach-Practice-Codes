import java.util.Scanner;

public class OddNoRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int m = s.nextInt();
        System.out.println("Enter the ending range: ");
        int n = s.nextInt();
        
        System.out.println("Odd numbers between " + m + " and " + n + " are: ");
        
        for (int i = m; i <= n; i++) {
            if(!(i % 2 == 0)) System.out.println(i);
        }

        s.close();
    }
}
