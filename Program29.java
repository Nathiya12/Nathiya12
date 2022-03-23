package program21to30;

import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		System.out.println("Enter a divisor:");
		int divisor = sc.nextInt();
		int Quotient = number / divisor;
		int Remainder = number % divisor;
		System.out.println("Quotient:" + Quotient);
		System.out.println("Remainder:" + Remainder);
		sc.close();
	}
}
