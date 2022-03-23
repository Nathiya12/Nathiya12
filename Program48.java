package program41to50;

import java.util.Scanner;

public class Program48 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int r, check = 0, temp;
		temp = number;
		while (number > 0) {
			r = number % 10;
			check = (check * 10) + r;
			number = number / 10;
			System.out.println("r is:" + r);
			System.out.println("check is:" + check);
			System.out.println("number is:" + number);
		}
		if (temp == check) {
			System.out.println("palindrome number");
		} else {
			System.out.println(" not palindrome number");
		}
		sc.close();
	}

}
