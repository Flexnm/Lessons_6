package lines;

public class Eline extends Wline {

	private int extra;

	public Eline(int length, int width, int extra) {
		super(length, width);
		this.extra = extra;
	}

	public void draw() {
		for (int i = 0; i < extra; i++) {
			super.draw(); // Calls the method with this name in the superclass (Wline).
			System.out.println();
		}

	}

}
