import java.util.Scanner;
public class Party {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount of tea: ");
        int t = s.nextInt();

        System.out.print("Enter the amount of candy: ");
        int c = s.nextInt();

        String result = evaluateParty(t, c);
        System.out.println(result);

        s.close();
    }

    public static String evaluateParty(int t, int c) {
        if (t < 5 || c < 5) {
            return "The party is bad.";
        } else if (t >= 2 * c || c >= 2 * t) {
            return "The party is great.";
        } else {
            return "The party is good.";
        }
    }
}

