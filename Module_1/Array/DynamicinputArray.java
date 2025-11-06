import java.util.Scanner;

public class DynamicinputArray {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = s.nextInt();

        int[] arr = new int[size];


        //sum
        int sum = 0;
        int even_sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter arr[" + i + "]:" );
            arr[i] = s.nextInt();

            //sum
            sum += arr[i];

            //even_sum
            if ((arr[i])%2 == 0 ){
                even_sum +=arr[i];
            }
            
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Sum of Even Elements: " + even_sum);


        //print array
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //average
        double average = sum / arr.length;
		System.out.println("Average of elements : " + average);

        
    }
}
