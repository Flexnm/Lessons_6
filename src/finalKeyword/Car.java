package finalKeyword;

public class Car {
	
	public final int number; 
	
	public Car(int number) {
		this.number = number;
	}
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car(101);
		Car c2 = new Car(102);
		Car c3 = new Car(103);
		Car c4 = new Car(104);
		Car c5 = new Car(105);
		
	//	c1.number = 3; the car number cannot be changed.
		
		System.out.println(c1.number);
		System.out.println(c2.number);
		System.out.println(c3.number);
		System.out.println(c4.number);
		System.out.println(c5.number);
		
	}
}
