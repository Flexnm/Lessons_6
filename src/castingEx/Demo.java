package castingEx;

import classExercises2.Animal;
import classExercises2.Cat;
import classExercises2.Crow;

public class Demo {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		Animal animal = cat; // up casting is implicit.
		
		// The casting operator (Type) is used to convert variables to another Type.
		cat = (Cat)animal; // down casting is explicit (programmer responsibility - use instanceof operator).
	
		Object obj = new Crow(); // Object Type object
		((Animal)obj).speak(); // Down casting to Type Animal - allows the use of method speak().
		((Crow)obj).fly(); // Down casting to Type Crow - allows the use of method fly().
		Animal x = ((Crow)obj); // Up casting from Crow to Type Animal.
		x.speak();
		
		Object all = new Crow();
		
		// Casting from Object to Animal.
		Animal a = (Animal) all;
		a.speak();
		
		// Casting from Object to Crow.
		Crow c = (Crow) all;
		c.speak();
		c.fly();
		
		// On the fly casting (without creating references, like 'a' and 'c' above).
		((Animal)all).speak();
		((Crow)all).fly();
	}

}
