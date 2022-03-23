package program50To60;

import java.util.Scanner;

public class Program59 {
	static int getGcd(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		int gcd = getGcd(n2, n1 % n2);
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number:");
		int num2 = sc.nextInt();
		System.out.println("GCD = " + getGcd(num1, num2));
		sc.close();
	}
}
