package polymorphism;

public class MethodOverLoading {

	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public void add(String n1, int n2) {
		System.out.println("hello everyone!"+n1);
	}
	

	public static void main(String[] args) {
		MethodOverLoading object = new MethodOverLoading();
		System.out.println(object.add(5, 6));
		System.out.println(object.add(1, 5, 9));
		object.add("Arun", 1);
	}

}
