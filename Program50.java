package program41to50;

import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");// 370
		int num = sc.nextInt();
		int original, digit, sum;
		original = num;
		sum = 0;
		while (num > 0) {
			digit = num % 10;// 0------7-------3
			sum += (digit * digit * digit);// 0-----343------370
			num = num / 10;// 37-----3-----0
			// System.out.println("value of digit:"+digit);
			// System.out.println("value of sum:"+sum);
			// System.out.println("value of num:"+num);
		}
		if (original == sum) {
			System.out.println(original + "It is a armstrong number");
		} else {
			System.out.println(original + "It is  not a armstrong number");
		}
		sc.close();
	}

}
