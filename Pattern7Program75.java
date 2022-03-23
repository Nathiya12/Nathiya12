package program69to75;

public class Pattern7Program75 {

	public static void main(String[] args) {
		int rows = 9;
		for (int i = rows; i >= 1; i--) {
			for (int space = 1; space <= (rows - i); space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
