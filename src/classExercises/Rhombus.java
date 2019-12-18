package classExercises;

public class Rhombus extends Shape {
	
	private int linea;
	private int lineb;
	
	public Rhombus(int linea, int lineb) {
		this.linea = linea;
		this.lineb = lineb;
	}
	
	public double getArea() {
		return (linea*lineb)/2;
	}

}
