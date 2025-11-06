
import java.util.Scanner;

public class AverageOfArrayElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // taking array size
        System.out.print("Enter array size : ");
        int size = s.nextInt();

        // creating array based on size
        int[] arr = new int[size];

        int sum = 0;
        // taking array elements from user
        for (int index = 0; index < arr.length; index++) {
            System.out.print("Enter arr[" + index + "] : ");
            arr[index] = s.nextInt();
            sum += arr[index];
        }

        //calculating avg
        double average = sum / arr.length;
        System.out.println("Average of elements : " + average);
        s.close();
    }
}
