
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter i : ");
            int i = s.nextInt();
            System.out.println("i------------->" + i);

            System.out.print("Enter string2: ");
            String s2 = s.nextLine();
            System.out.println("s2 ----> " + s2);

            System.out.print("Enter string1: ");
            String s1 = s.next();
            System.out.println("s1 ----> " + s1);

            System.out.print("Enter d : ");
            double d = s.nextDouble();
            System.out.println("d------------->" + d);
        }
    }

}
