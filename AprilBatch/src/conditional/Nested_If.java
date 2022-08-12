package conditional;

public class Nested_If {

	public static void main(String[] args) {
		String userName = "amin1122";
		String passWord = "123654";

		if (userName == "amin1122") {
			System.out.println("userName is correct");
			if (passWord == "123654") {
				System.out.println("passWord is correct");
			} else {
				System.out.println("wrong password");
			}
		} else {
			System.out.println("wrong username");
		}

	}

}
