package program61To68;

public class Program62 {

	public void binaryToOctal() {
		int binaryNum = 11110000;
		int decimalNum = 0, remainder = 0, n = 0;
		String temp = "", tempOctalNum = "";
		while (binaryNum != 0) {
			remainder = binaryNum % 10;
			decimalNum += remainder * Math.pow(2, n);
			binaryNum = binaryNum / 10;
			n++;
		}
		System.out.println("Decimal Number :" + decimalNum);
		while (decimalNum != 0) {
			remainder = decimalNum % 8;
			temp += remainder;
			decimalNum = decimalNum / 8;
		}
		for (int i = (temp.length() - 1); i >= 0; i--) {
			tempOctalNum += temp.charAt(i);
		}
		int octalNum = Integer.parseInt(tempOctalNum);
		System.out.println("Octal Number :" + octalNum);
		System.out.println();
	}

	public void octalToBinary() {
		int octalNum = 360;
		int decimalNum = 0, remainder = 0, n = 0;
		String binary = "", temp = "";
		while (octalNum != 0) {
			remainder = octalNum % 10;
			decimalNum += remainder * Math.pow(8, n);
			octalNum = octalNum / 10;
			n++;
		}
		System.out.println("Decimal Number :" + decimalNum);
		while (decimalNum != 0) {
			remainder = decimalNum % 2;
			temp += remainder;
			decimalNum = decimalNum / 2;
		}
		for (int i = (temp.length() - 1); i >= 0; i--) {
			binary += temp.charAt(i);
		}
		int binaryNum = Integer.parseInt(binary);
		System.out.print("Binary Number :" + binaryNum);
	}

	public static void main(String[] args) {
		Program62 t = new Program62();
		t.binaryToOctal();
		t.octalToBinary();
	}
}
