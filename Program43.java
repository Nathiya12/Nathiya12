package program41to50;

import java.util.Scanner;

public class Program43 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = sc.nextInt();
		System.out.println("Enter a second number:");
		int b = sc.nextInt();
		int g = 0;
		int lcm;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				g = i;
		}
		// LCM=(a*b)/GCD
		lcm = (a * b) / g;
		System.out.println("LCM=" + lcm);
		sc.close();
	}

}
