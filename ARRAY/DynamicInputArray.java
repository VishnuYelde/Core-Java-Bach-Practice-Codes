import java.util.Scanner;

public class DynamicInputArray
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// taking array size
		System.out.print("Enter array size : ");
		int size = s.nextInt();

		// creating array based on size
		int[] arr = new int[size];

		// taking array elements from user
		for (int index=0; index<arr.length; index++)
		{
			System.out.print("Enter arr[" + index + "] : ");
			arr[index] = s.nextInt();
		}

		// print array
		System.out.println("======================");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		s.close();
	}
}