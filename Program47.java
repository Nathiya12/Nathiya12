package program41to50;

import java.util.Scanner;

public class Program47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base:");
		int base = sc.nextInt();
		System.out.println("Enter the exponent:");
		int exponent = sc.nextInt();
		int power = 1;
		while (exponent > 0) {
			power = power * base;
			--exponent;
		}
		System.out.println("Power of a number is:" + power);
		sc.close();
	}
}
