package program41to50;

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of terms:");
		int num = sc.nextInt();
		int t1 = 0;
		int t2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(t1 + "  ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		sc.close();
	}

}
