package program11To20;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value of length and breath:");
		int length = scan.nextInt();
		int breath = scan.nextInt();
		int areaOfTheRectangle = length * breath;
		System.out.println("Area of the square is:" + areaOfTheRectangle);
		scan.close();
	}

}
