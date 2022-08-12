package Practice;

public class PrimeNo {
	public static void prime() {
		int n;
		n = 1;
		int count = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {

				count++;
			}

		}
		if (count == 2) {
			System.out.println("this no is  Prime No");
		} else {
			System.out.println("this no is not a prime no");
		}

	}

	public static void main(String[] args) {
		prime();

	}

}
