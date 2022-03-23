package program21to30;

import java.util.Scanner;

public class Program26 {
	
	public static void main(String[] args) {
		double kilometers;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter kilometers:");
		kilometers = in.nextDouble();
		double miles = kilometers / 1.6;// 1km=0.621miles
		System.out.println(miles + " Miles");

		float Fahrenheit, Celsius;
		Celsius = 13;
		Fahrenheit = ((Celsius * 9) / 5) + 32;// Celsius formula;
		System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
		in.close();
	}

}
