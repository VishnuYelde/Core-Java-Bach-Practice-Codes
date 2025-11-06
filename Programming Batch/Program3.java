import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int month = s.nextInt();

            checkmonth(month);
        }
    }

    public static void checkmonth(int month){
        // if (month>=1 && month <=12) {
        //     if (month%2 == 0){
        //         System.out.println("Even");
        //     } 
        //     else {
        //         System.out.println("Odd");
        //     }
        // } 
        // else {
        //     System.out.println("Invalid month");
        // }
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11: System.out.println(month + " is an odd month");
                break;

            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12: System.out.println(month + " is an even month");
                break;
        
            default: System.out.println("Invalid Input");
                break;
        }



    }
}
