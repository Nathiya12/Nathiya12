package program21to30;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = sc.nextInt();
		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + "is a leap year");
		} else {
			System.out.println(year + "is a not leap year");
		}
		sc.close();
	}

}
