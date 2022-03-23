package program61To68;

public class Program65 {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] firstMatrix = { { 2, 3, 4 }, { 2, 2, 3 } };
		int[][] secondMatrix = { { 6, 5, 3 }, { 5, 6, 3 } };
		// Adding Two matrices
		int[][] sum = new int[2][3];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
