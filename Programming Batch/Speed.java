import java.util.*;
public class Speed {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the speed of A car:");
            int a = s.nextInt();

            System.out.print("Enter the speed of B car:");
            int b = s.nextInt();

            System.out.print("Enter the speed of C car:");
            int c = s.nextInt();

            boolean output = Speeds(a, b, c);
            System.out.println(output);
        }
    }

    public static boolean Speeds(int a, int b, int c) {
        int[] fast = {a, b, c};
        Arrays.sort(fast); 
        return (fast[1] - fast[0]) == (fast[2] - fast[1]); 
    }
}

