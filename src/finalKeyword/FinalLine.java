package finalKeyword;

import lines.Line;

public final class FinalLine extends Line {
	
	public FinalLine(int length) {
		super(length);
	}
	
	public void draw() {
		super.draw();
		System.out.println("===============");
		
	}
	
	

}
