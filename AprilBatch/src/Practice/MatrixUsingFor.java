package Practice;

public class MatrixUsingFor {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}

		for (int k = 1; k <= 5; k = k + 1) {

			for (int a = 1; a <= k; a++) {
				System.out.print(k);
			}
			System.out.println();
		}

		for (int m = 1; m <= 5; m++) {

			for (int n = 1; n <= m; n = n + 1) {
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
