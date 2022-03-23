package topics.java;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		//int a = 34, b = 0, div = 1;
		try {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter a dividing number:");
			int a=scan.nextInt();
			System.out.print("Enter a divisor:");
			int b=scan.nextInt();
	   	 int c   = a / b;
			System.out.println("The Answer is"+c);	
			scan.close();
		 } catch (Exception e) {
			System.out.println("pls check b value");

		} finally {
			System.out.println("your program excuted well!!");
		}

	}

}
