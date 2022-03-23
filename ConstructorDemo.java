package topics.java;

public class ConstructorDemo {

	ConstructorDemo(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	public ConstructorDemo() {
		System.out.println("I am a non Parameterized constructor");
	}
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo("vijay", 14);
		ConstructorDemo c1 = new ConstructorDemo();
	}

}
