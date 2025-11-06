import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            // System.out.println("Enter a number: ");
            // int a = s.nextInt();
            // System.out.println("---> " + a);
            
            // System.out.println("Enter a number: ");
            // int b = s.nextByte();
            // System.out.println("---> " + b);

            // System.out.println("Enter a number: ");
            // int c = s.nextShort();
            // System.out.println("---> " + c);

            // System.out.println("Enter a number: ");
            // float d = s.nextFloat();
            // System.out.println("---> " + d);

            // System.out.println("Enter a number: ");
            // double e = s.nextDouble();
            // System.out.println("---> " + e);

            // System.out.println("Enter a true or false: ");
            // boolean f = s.nextBoolean();
            // System.out.println("---> " + f);

            System.out.println("Enter a string: ");
            // String g = s.next();
            String g = s.nextLine();
            System.out.println("---> " + g);

            System.out.println("Enter a char: ");
            char h = s.next().charAt(0);
            System.out.println("---> " + h);
        }



    }
}
