package program50To60;

import java.util.Scanner;

public class Program53 {
	
	public static void main(String[] args) {
		double num1, num2;
		double output;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		num1 = scanner.nextDouble();
		System.out.print("Enter second number:");
		num2 = scanner.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		switch (operator) {
		case '+':
			output = num1 + num2;
			System.out.println(num1 + " " + operator + " " + num2 + "= " + output);
			break;
		case '-':
			output = num1 - num2;
			System.out.println(num1 + " " + operator + " " + num2 + "= " + output);
			break;
		case '*':
			output = num1 * num2;
			System.out.println(num1 + " " + operator + " " + num2 + "= " + output);
			break;
		case '/':
			output = num1 / num2;
			System.out.println(num1 + " " + operator + " " + num2 + "=" + output);
			break;
		default:
			System.out.printf("You have entered wrong operator");	 
			scanner.close();  
		}
	
	       
	}
}



