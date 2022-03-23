package program31to40;

import java.util.Scanner;

public class Program35 {
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		System.out.println("Enter the value of b:");
		b = sc.nextInt();
		System.out.println("Enter the value of c:");
		c = sc.nextInt();
		int d = (b * b) - (4 * a * c);
		double D = Math.sqrt(d);
		int e = 2 * a;
		double methodone = (-b - D) / e;
		double methodtwo = (-b + D) / e;
		System.out.println("d:" + d);
		System.out.println("D:" + D);
		System.out.println("e:" + e);
		System.out.println("methodone:" + methodone);
		System.out.println("methodtwo:" + methodtwo);
		if (D > 0) {
			System.out.println("The quadratic equation are real and unequal ");
		} else if (D == 0) {
			System.out.println("The quadratic equation are real and equal ");
		} else {
			System.out.println("The quadratic equation are complex and unequal ");
		}
	sc.close();
	}
}
