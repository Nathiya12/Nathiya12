package program41to50;

import java.util.Scanner;

public class Program46 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		while(a>0) {
			int b = a % 10;
			a = a / 10;
			System.out.print(b);
		} 
		sc.close();
	}

}
