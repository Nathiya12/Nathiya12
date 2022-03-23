package program41to50;

import java.util.Scanner;

public class Program49 {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int m ;
		  m = num / 2;
		  boolean prime=true;
		System.out.println("value of m:"+m);
		for (int i = 2; i < m; i++) {
			if (num % i== 0) {
				System.out.println(num + " -It is not a prime number");
			prime=false;
				break;
			}
		}
		if (prime&&(num!=0&&num!=1)) {
			System.out.println(num + " -It is  a prime number");
		}	
		sc.close();
	}

}
