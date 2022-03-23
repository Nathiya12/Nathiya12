package program69to75;

public class Pattern3Program71 {
	
	public static void main(String[] args) {
		int rows = 9;
		for (int i = 1; i <= rows; i++) {
			for (int space = 1; space <= (rows - i); space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
