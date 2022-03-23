package program11To20;

import java.util.Scanner;

public class Program16 {
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a value of R and r:");
	int R=scan.nextInt();
	int r=scan.nextInt();
	double areaOfTheCircle=3.14*((R*R)-(r*r));
	System.out.println(areaOfTheCircle);
	scan.close();
	}

}
