package Practice;

public class Condition2 {
	int per = 98;

	public void marks() {

		if (per <= 35) {
			System.out.println("fail");
		} else if (per <= 45) {
			System.out.println("pass class");
		} else if (per <= 60) {
			System.out.println("2nd class");

		} else if (per <= 75) {
			System.out.println("1st class");
		} else {

			System.out.println("distinction");
		}

	}

	public static void main(String[] args) {

		Condition2 c2 = new Condition2();
		c2.marks();

	}

}
