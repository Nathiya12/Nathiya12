package program41to50;

import java.util.Scanner;

public class Program45 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer number:");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits the entered Integer are:" + count);
		sc.close();
	}

}
