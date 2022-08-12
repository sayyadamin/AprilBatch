package conditional;

public class Nested_3no {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;

		if (a == b) {
			System.out.println("a is equal to b");
			if (b == c) {
				System.out.println("b is equal to c");
			} else {
				System.out.println("b is not equal to c");
			}
		} else {
			System.out.println("a is not equal to b");
		}

	}

}
