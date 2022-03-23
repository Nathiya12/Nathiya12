package program69to75;

public class Pattern4Program72 {

	public static void main(String[] args) {
		int rows = 5, i, space, j, k;
		for (i = 1; i <= rows; i++) {
			for (space = 1; space <= (rows - i) * 2; space++) {
				System.out.print(" ");
			}
			for (j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
