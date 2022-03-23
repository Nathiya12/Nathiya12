package program61To68;

import java.util.Scanner;

public class Program61 {

	public void octalToDecimal() {
		int octalNum = 360;
		int decimalNum = 0, remainder = 0, n = 0;
		while (octalNum != 0) {
			remainder = octalNum % 10;//0 6 3
			decimalNum += remainder * Math.pow(8, n);//0 48 240
			octalNum = octalNum / 10;//36 3 0
			n++;
			System.out.println(octalNum);
		}
		System.out.println("Decimal Number :" + decimalNum);
	}

	public void decimalToOctal() {
		int decimalNum = 240;
		String octalNum = "", temp = "";
		int remainder = 0, n = 0;
		while (decimalNum != 0) {
			remainder = decimalNum % 8;//0 6 3
			temp += remainder;//0 06 063
			n++;
			decimalNum = decimalNum / 8;//30 3 0
			//System.out.println(remainder);
		}
		for (int i = (temp.length() - 1); i >= 0; i--) {
			octalNum += temp.charAt(i);
		}
		System.out.print("Octal Number :" + octalNum);
	}

	public static void main(String[] args) {
		Program61 t = new Program61();
		t.octalToDecimal();
		t.decimalToOctal();
	}

}
