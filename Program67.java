package program61To68;

public class Program67 {

	public static void main(String[] args) {
		int original[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int transpose[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = original[j][i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
