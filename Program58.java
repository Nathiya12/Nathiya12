package program50To60;

import java.util.Scanner;

public class Program58 {

	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String args[]) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = d.nextInt();
		int answer = factorial(num);
		System.out.println("Factorial of entered number is: " + answer);
		d.close();
	}

}
