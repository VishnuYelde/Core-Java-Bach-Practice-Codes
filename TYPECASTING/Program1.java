public class Program1
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		double d1 = 250.26;

		// widening
		int i2 = b1; 	//implecitly
		System.out.println(i2);

		int i3 = (int)b1;	//explicitly
		System.out.println(i3);

		int i1 = (int) d1;
		System.out.println(i1);



		char ch1 = 'a';
		System.out.println(ch1);
		int i4 = ch1;
		System.out.println(i4);
		int i5 = (int)ch1;
		System.out.println(i5);
	}
}