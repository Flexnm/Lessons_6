package methodOverloading;

public class Calculator {

	// Version 1 of the method
	public int sum(int a, int b) {
		return a + b;
	}
	// Version 2 of the method
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	// Method Overload: same method name, multiple times with different parameters.
	
	public static void main(String[] args) {

		Calculator c = new Calculator();

		// Method invocation:
		int sum = c.sum(3, 6);
		System.out.println(sum);

		sum = c.sum(10, 30);
		System.out.println(sum);

		sum = c.sum(2, 4, 6);
	}

}
