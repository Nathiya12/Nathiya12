package program11To20;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a ,b and c:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = (b * b) - (4 * a * c);
		double D = Math.sqrt(d);
		int E = 2 * a;
		double methodOne = (-D - b) / E;
		double methodTwo = (D - b) / E;
		System.out.println("value of d is:" + d);
		System.out.println("value of D is:" + D);
		System.out.println("value of E is:" + E);
		System.out.println("value of methodOne is:" + methodOne);
		System.out.println("value of methodTwo is:" + methodTwo);
		if (d == 0) {
			System.out.println("Equation is Real and Unequal!");
		} else if (d == 0) {
			System.out.println("Equation is Real and Equal!");
		} else {
			System.out.println("Equation is Complex and Unequal");
		}
		scan.close();
	}
}
