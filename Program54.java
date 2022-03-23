package program50To60;

import java.util.Scanner;

public class Program54 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a starting value:");
		int start = sc.nextInt();
		System.out.println("Enter a ending  value:");
		int end = sc.nextInt();
		while (start <= end) {
			int m = start / 2;
			boolean check = true;
			for (int i = 2; i <= m; i++) {
				if (start % i == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				System.out.print(start + " ");
			}
			++start;
		}
		sc.close();
	}

}
