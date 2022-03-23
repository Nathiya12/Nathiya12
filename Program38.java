package program31to40;

import java.util.Scanner;

public class Program38 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		// formula (sum of natural numbers)=n*(n+1)/2;
		a = n + 1;
		b = n * a;
		c = b / 2;
		System.out.println("Sum of Natural number is:" + c);
		sc.close();
	}

}
