package program11To20;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value of radius and height:");
		double radius = scan.nextDouble();
		double height = scan.nextDouble();
		double part1 = (2 * 3.14 * radius );
		double part2 = height + radius;
		double areaOfTheCylinder = part1 * part2;
		System.out.println("Area of the square is:" + areaOfTheCylinder);
		scan.close();
	}
}
