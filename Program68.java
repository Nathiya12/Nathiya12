package program61To68;

public class Program68 {

	public static void main(String[] args) {
		int[][] matrixA = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] matrixB = { { 2, 3 }, { -9, 0 }, { 0, 4 } };
		// Mutliplying Two matrices
		int[][] matrixC = multiplyMatrices(matrixA, matrixB);
		// Displaying the result
		displaymatrixC(matrixC);
	}

	public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					matrixC[i][j] = matrixC[i][j] + matrixA[i][k] * matrixB[k][j];

				}
			}
		}
		return matrixC;
	}

	public static void displaymatrixC(int[][] matrixC) {
		System.out.println("Product of two matrices is: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrixC[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
