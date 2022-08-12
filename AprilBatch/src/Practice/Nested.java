package Practice;

public class Nested {

	String userId = "amin";
	String passWord = "1234";

	public void signUp() {

		if ("amin" == userId) {
			System.out.println("userId is correct");

			if ("1234" == passWord) {
				System.out.println("password is correct");
			} else {
				System.out.println("passWord is wrong");
			}
		} else {
			System.out.println("userId is wrong");
		}

	}

	public static void main(String[] args) {
		Nested s1 = new Nested();
		s1.signUp();

	}
}
