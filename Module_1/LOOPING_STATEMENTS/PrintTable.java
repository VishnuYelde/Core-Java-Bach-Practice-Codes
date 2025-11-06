public class PrintTable
{
	public static void main(String[] args) 
	{
		System.out.println("=========================\n");

		int n = 5;

		int i = 1;
		do
		{
			System.out.println(n+" X "+i+" = "+(n*i));
			i++;
		}while (i <= 10);


		System.out.println("\n=========================");
	}
}