import java.util.Scanner;

public class oddEvenDelhiRule {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Length of the array: ");
        int len = s.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter Date: ");
        int date = s.nextInt();
        System.out.println("Enter Fine for each vehicle: ");
        int x = s.nextInt();
        s.close();
        System.out.println("Total Fine collected: " + oddEvenDelhiRule(arr, date, x));
    }

    public static int oddEvenDelhiRule(int[] arr, int date, int x) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        if (date % 2 == 0) {
            System.out.println("Total Odd Vehicles Found: " + countOdd);
            return countOdd * x;
        } else {
            System.out.println("Total Even Vehicles Found: " + countEven);
            return countEven * x;
        }
    }

}
