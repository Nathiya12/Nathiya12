package polymorphism;

class Animal {
	void eat() {
		System.out.println("eats");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog eats");
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Animal a1 = new Animal();
		d1.eat();
		a1.eat();
	}

}
