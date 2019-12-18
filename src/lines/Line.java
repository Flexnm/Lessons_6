package lines;

public class Line { // Prints '*' according to the length of the line.

	private int length;

	// CTOR
	public Line(int length) {
		this.length = length;
	}

	// Method:
	public void draw() {
		for (int i = 0; i < length; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
