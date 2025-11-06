public class Program2
{
	public static void main(String[] args) 
	{
		double d1 = 3.141;
		System.out.println(d1);

		//narrowing
		int i1 = (int)d1;	//explicitly
		System.out.println(i1);

		System.out.println(test());
		
	}

	public static int test()
	{
		return (int)30.257;
	}
}