package program31to40;

import java.util.Scanner;

public class Program32 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "is a even number");
		} else {
			System.out.println(num + "is a odd  number");
		}
		input.close();
	}

}
