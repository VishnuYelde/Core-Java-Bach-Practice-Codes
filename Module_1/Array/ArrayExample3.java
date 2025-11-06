public class ArrayExample3
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 40, -30, 50, 100};

		System.out.println(arr[1]);
		System.out.println(arr[3]);


		//RE-ASSIGN DATA
		arr[2] = 5000;
		System.out.println("new data --> "+arr[2]);


		System.out.println("arr[0] : "+arr[0]);
		// System.out.println("arr[5] : "+arr[-5]);


		//accessing the size of array
		System.out.println("length of array : " + arr.length);
		
	}
}