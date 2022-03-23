package program50To60;

import java.util.Scanner;

public class Program57 {

	public static int addNumbers(int num) {
		if (num != 0)
			return num * (num + 1) / 2;
		else
			return num;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num = scan.nextInt();
		//Program57 answer = new Program57();
		addNumbers(num);
		System.out.println(addNumbers(num));
		scan.close();
	}
}
