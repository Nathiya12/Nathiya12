package program31to40;

import java.util.Scanner;

public class Program33 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(ch + " is a vowel");
			break;
		}
		if (ch >= 65 && ch <= 90 || ch <= 96 && ch <= 122) {
			System.out.println(ch + "is a constant");
		}
		sc.close();
	}
}
