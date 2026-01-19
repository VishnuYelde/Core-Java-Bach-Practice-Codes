import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        System.out.println("---Main Start---");
        int bal = 15000;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the withdrawable amount: ");
        int amt = s.nextInt();

        try {
            if (amt <= bal) {
                bal -= amt;
                System.out.println(amt + " withdraw successfully\nAvailable Balance: " + bal);
            } else {

                // InsufficientException ie = new InsufficientException();
                // ! This can also possible --> throw ie;

                throw new InsufficientException();
            }

        } catch (InsufficientException i1) {
            System.out.println(i1.getMessage());
        } finally {
            s.close();
            System.out.println("Thankyou for visiting, have a nice day");
        }
        System.out.println("---Main End---");
    }

}

// Checked Exception
class InsufficientException extends Exception {
    public String getMessage() {
        return "Aare kelya tuzhyakade yevdhe paisech nahi";
    }
}
