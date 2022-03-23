package program50To60;

import java.util.Scanner;

public class Program51 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number:");
		int start = sc.nextInt();
		System.out.println("Enter Ending number:");
		int end = sc.nextInt();
		System.out.println("Armstrong  numbers between" + start + "and" + end + "are:");
		int n, sum;
		for (int i = start; i <= end; i++) {
			n = i;
			sum = 0;
			while (n > 0) {
				int digit = n % 10;
				sum = sum + (digit * digit * digit);
				n = n / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}

}
