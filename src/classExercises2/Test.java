package classExercises2;

public class Test {
	public static void main(String[] args) {

		Animal[] voices = new Animal[8];

		// voices[n] is a reference of type Animal.
		// The reference determines witch method we can call.
		// The actual Object (type) at runtime determines the behavior.
		voices[0] = new Crow();
		voices[1] = new Cat();
		voices[2] = new Dog();
		voices[3] = new Dog();
		voices[4] = new Crow();
		voices[5] = new Cow();
		voices[6] = new Cat();
		voices[7] = new Cat();

		for (int i = 0; i < voices.length; i++) {
			voices[i].speak();

			if (voices[i] instanceof Crow) {
				Crow crow = (Crow) voices[i]; // Casting from Animal reference to crow reference.
				crow.fly(); // Now we can call the fly() method.
				// voices[i].fly(); Can't be done because voices[i] is in the superclass Animal.
			}
		}
	}
}
