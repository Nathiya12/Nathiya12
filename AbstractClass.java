package topics.java;

abstract class Bike {
	abstract void run();

	void display() {
		System.out.println("hello everyone!..I am a normal method");
	}
}

class Vehicle extends Bike {
	void run() {
		System.out.println("bike is running safely");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Vehicle b = new Vehicle();
		b.run();
		b.display();
	}

}
