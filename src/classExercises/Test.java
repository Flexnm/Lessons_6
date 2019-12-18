package classExercises;

public class Test {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];

		shapes[0] = new Circle(4);
		shapes[1] = new Rectangle(4, 8);
		shapes[2] = new Rhombus(5, 6);
		shapes[3] = null;
		shapes[4] = new Triangle(8, 12);

		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] != null) { // Makes sure the reference to current shape is not null.
				System.out.println("Area: " + shapes[i].getArea());
			}
		}

	}

}
