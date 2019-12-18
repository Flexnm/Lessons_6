package lines;

public class Tests {
	public static void main(String[] args) {

		Line line1 = new Line(5);

		line1.draw();

		System.out.println();

		Wline line2 = new Wline(4, 3);

		line2.draw();

		System.out.println();

		Eline line3 = new Eline(6, 5, 2);

		line3.draw();
	}

}
