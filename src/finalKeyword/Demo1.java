package finalKeyword;

public class Demo1 {
	
	public static void main(String[] args) {
		
		final int  x = 5; // Keyword "final" makes it so the local variable cannot be changed.
		System.out.println(x);
		
	//	x = 25; // final variables cannot be reassigned.
	//	System.out.println(x);
		
		
		// blank final variable
		final int y;
		System.out.println("y is not yet initialized");
//		System.out.println(y); Error.
		
		y = 100; // from now on y value cannot be changed.
		System.out.println(y);
	}

}
