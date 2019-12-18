package classExercises;

public class Triangle extends Shape{
	
	private int height;
	private int side;
	
	public Triangle(int height, int side) {
		this.height = height;
		this.side = side;
	}
	
	public double getArea() {
		
		return (height*side)/2;
	}
	
	

}
