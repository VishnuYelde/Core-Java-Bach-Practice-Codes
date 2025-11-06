public class Program1
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		int i1 = 100;

		// widening
		int i2 = b1; 	//implecitly
		int i3 = (int)b1;	//explicitly




		char ch1 = 'a';
		int i4 = ch1;
		int i5 = (int)ch1;
		System.out.println(i4);
		System.out.println(ch1);


		
	}

    public static int add(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}