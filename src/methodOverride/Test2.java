package methodOverride;

public class Test2 {
	public static void main(String[] args) {

		// References

		Shape s;
		Rectangle r;
		Circle c;

		// Assign reference to objects

		// 's' can be a reference to multiple objects because it is of the superclass.

		s = new Shape(); // Here 's' is a Shape object
		System.out.println("Shape area: " + s.getArea());

		s = new Rectangle(4, 6); // Here 's' is a Rectangle (that is a Shape) object
		System.out.println("Rectangle area: " + s.getArea());

		s = new Circle(3); // Here 's' is a Circle (that is a Shape) object
		System.out.println("Circle area: " + s.getArea());

		// =========================================

		r = new Rectangle(9, 7);

		c = new Circle(1);
		
		// different shapes arrays:
		
		Rectangle[] rectangles = new Rectangle[3]; // Can only accept Rectangle objects.
		rectangles[0] = r;
	//	rectangles[1] = c; Error
	//	rectangles[2] = s; Error
		
		Circle[] circles = new Circle[3]; // Can only accept Circle objects.
	//	circles[0] = r; Error
		circles[1] = c;
	//	circles[2] = s; Error
		
		Shape[] shapes = new Shape[3]; // Can accepts all Shape objects.
		shapes[0] = r;
		shapes[1] = c;
		shapes[2] = s;

	}
}
