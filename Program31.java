package program31to40;

import java.util.Scanner;

public class Program31 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter a second number:");
		int num2 = scan.nextInt();
		System.out.println("Before swap:" + num1 + "  " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap:" + num1 + "  " + num2);
		scan.close();
	}

}
