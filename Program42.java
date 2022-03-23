package program41to50;

import java.util.Scanner;

public class Program42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = sc.nextInt();
		System.out.println("Enter a second number:");
		int b = sc.nextInt();
		int g = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				g = i;
		}
		System.out.println("GCD=" + g);
		sc.close();
	}

}
