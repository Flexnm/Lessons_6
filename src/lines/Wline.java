package lines;

public class Wline extends Line {

	private int width;

	public Wline(int length, int width) {
		super(length);
		this.width = width;
	}

	public void draw() {
		for (int i = 0; i < width; i++) {
			super.draw(); // Calls the method with this name in the superclass (Line).
		}

	}

}
