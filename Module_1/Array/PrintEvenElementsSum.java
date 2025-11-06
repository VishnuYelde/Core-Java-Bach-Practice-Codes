import java.util.Scanner;

public class PrintEvenElementsSum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// taking array size
		System.out.print("Enter array size : ");
		int size = s.nextInt();

		// creating array based on size
		int[] arr = new int[size];

		int even_sum = 0;
		// taking array elements from user
		for (int index=0; index<arr.length; index++)
		{
			System.out.print("Enter arr[" + index + "] : ");
			arr[index] = s.nextInt();

			//checking for vene elements
			if (arr[index]%2 == 0)
				even_sum += arr[index];
		}

		//Printing sum of only even elements of an array
		System.out.println("Sum of even elements : " + even_sum);
		
	}
}