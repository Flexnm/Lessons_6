package methodOverride;

public class Shape {
	
	
	// Method
	
	
	/**
	 * This method returns the area of this shape.
	 * 
	 * @return implemented to return -1 for now.
	 */
	public double getArea() {
		return -1;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		Shape s2 = new Shape();
		
		System.out.println("Area: " + s1.getArea());
		System.out.println("Area: " + s2.getArea());
	}

}
