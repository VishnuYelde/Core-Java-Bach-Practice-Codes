public class MethodOverloading3 {
	public static void main(String[] args) {
		Operations op = new Operations();
		System.out.println(op.add(2.3,5));
		System.out.println(op.add(5, 4, 8));


		// System.out.println(add(2,5));
		// System.out.println(add(2,5,6));
		// System.out.println(add(5.2, 5.5));
	}
	
	// public static int add(int a, int b){
	// 	return a+b;
	// }

	// public static double add(double a, double b){
	// 	return a+b;
	// }

	// public static int add(int a, int b, int c){
	// 	return a+b+c;
	// }
}

class Operations{
	public int add(int a, int b){
		return a+b;
	}
	public int add(int a, int b, int c){
		return a+b+c;
	}
	public int add(int a, int b, int c, int d){
		return a+b+c+d;
	}
	double add(double a, double b){
		return a+b;
	}
}