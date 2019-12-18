package methodOverride;

public class Test {
	public static void main(String[] args) {

		Shape s1 = new Shape();
		Rectangle r1 = new Rectangle(4, 6);
		Circle c1 = new Circle(5);

		System.out.println(s1.getArea());
		System.out.println(r1.getArea());
		System.out.println(c1.getArea());

		Shape shape; // Super reference - can point to any Shape sub-type.
		
		shape = new Rectangle(2, 3);
		System.out.println(shape.getArea());
		
		shape = new Circle(4);
		System.out.println(shape.getArea());
	}

}
