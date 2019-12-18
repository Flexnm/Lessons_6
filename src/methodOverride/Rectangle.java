package methodOverride;

public class Rectangle extends Shape {

	// Attributes
	private int length;
	private int width;

	// CTORs
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;

	}
	// To override a method, requires to be in an area that is valid to write a
	// method (outside of other methods).
	// Methods

	public double getArea() { // Can also use Source > Override/Implement methods.
		return length * width; // The little triangle to the left is highlighting the fact that this method
								// overrides a method in the superclass.
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(5, 6);

		System.out.println("Area: " + r1.getArea());
	}

}
