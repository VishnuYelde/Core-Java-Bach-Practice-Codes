public class LocalVariables1
{
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println("Block-1 : "+a);
		
		{
			int b = 20;
			System.out.println("Block-2 : "+b);

		}
		
		{

			int b = 5000000;
			System.out.println("Block-3 : "+b);
		}
		
	}
}