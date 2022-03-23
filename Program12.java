package program11To20;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a side value:");
		int side = scan.nextInt();
		int areaOfTheSquare = side * side;
		System.out.println("Area of the square is:" + areaOfTheSquare);
		scan.close();
	}

}
