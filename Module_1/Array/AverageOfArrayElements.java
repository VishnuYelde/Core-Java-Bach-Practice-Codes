import java.util.Scanner;


public class AverageOfArrayElements
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// taking array size
		System.out.print("Enter array size : ");
		int size = s.nextInt();

		// creating array based on size
		int[] arr = new int[size];

		int sum = 0;
		// taking array elements from user
		for (int i=0; i < arr.length; i++)
		{
			System.out.print("Enter arr[" + i + "] : ");
			arr[i] = s.nextInt();
			sum += arr[i];
		}

		//calculating avg
		double average = sum / arr.length;
		System.out.println("Average of elements : " + average);

		
	}
}