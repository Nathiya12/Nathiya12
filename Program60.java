package program50To60;

public class Program60 {

	public void binaryToDecimal() {

		int binaryNum = 11110000;
		int decimalNum = 0, remainder = 0, n = 0;

		while (binaryNum != 0) {
			remainder = binaryNum % 10;
			decimalNum += remainder * Math.pow(2, n);
			binaryNum = binaryNum / 10;
			n++;
		}
		System.out.println("Decimal Number :" + decimalNum);
	}

	public void decimalToBinary() {
		int decimalNum = 240;
		String binaryNum = "", temp = "";
		int remainder = 0;
		int n= 0;
		while (decimalNum != 0) {
			remainder = decimalNum % 2;
			temp += remainder;
			n++;
			decimalNum = decimalNum / 2;
		}
		for (int i = (temp.length() - 1); i >= 0; i--) {
			binaryNum += temp.charAt(i);
		}
		System.out.print("Binary Number :" + binaryNum);
	}

	public static void main(String[] args) {
		Program60 t = new Program60();
		t.binaryToDecimal();
		t.decimalToBinary();
	}

}
