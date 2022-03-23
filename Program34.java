package program31to40;

import java.util.Scanner;

public class Program34 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = sc.nextInt();
		System.out.println("Enter a second number:");
		int b = sc.nextInt();
		System.out.println("Enter a third  number:");
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a + "largest");
		} else if (b > a && b > c) {
			System.out.println(b + "largest");
		} else {
			System.out.println(c + " largest");
		}
		sc.close();
	}

}
