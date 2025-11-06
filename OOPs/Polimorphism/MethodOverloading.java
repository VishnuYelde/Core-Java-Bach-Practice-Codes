public class MethodOverloading
{
	public static void main(String[] args) 
	{
		System.out.println(add(20, 10));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, 50, 40));
        System.out.println(add(10, 20, 80, 60, 40));
		System.out.println("Hello");
	}

	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static int add(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
	public static int add(int a, int b, int c, int d, int e)
	{
		return a+b+c+d+e;
	}	
}