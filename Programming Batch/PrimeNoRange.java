
import java.util.Scanner;

public class PrimeNoRange {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range for Prime no.: ");
        int a = s.nextInt();
        int b = s.nextInt();
        PrimeNo(a, b);
        s.close();
    }

    public static void PrimeNo(int a, int b) {
        System.out.println("Prime Numbers are: ");
        for (int i = a; i <= b; i++) {
            if (Prime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean Prime(int i) {
        if (i <= 1) {
            return false;
        }

        if (i == 2 || i == 3) {
            return true;
        }
        if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }

        for (int j = 5; j * j <= i; j += 6) {
            if (i % j == 0 || i % (j + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
