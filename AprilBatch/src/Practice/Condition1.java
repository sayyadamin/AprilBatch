package Practice;

public class Condition1 {
	int leakRate = 10;

	public void leakTest() {
		// int leakRate = 22;

		if (leakRate <= 25) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	public void leakTest1() {
		if (leakRate <= 10) {

			System.out.println("good result");
		}
	}

	public static void main(String[] args) {

		Condition1 c1 = new Condition1();
		c1.leakTest();
		c1.leakTest1();

	}

}
