import java.util.Scanner;
import java.util.Arrays;

public class PassingArrayToMethod
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

		//printing array
		printArray(arr);

		//in-built method to print array
		System.out.println("toString=========================");
		System.out.println(Arrays.toString(arr));

	}

	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int i=0; i<arr.length-1; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "]");
	}


}