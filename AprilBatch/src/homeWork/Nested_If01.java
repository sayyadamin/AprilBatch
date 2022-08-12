package homeWork;

public class Nested_If01 {

	public static void main(String[] args) {

		String userName = "xyz";
		String password = "123456";

		if (userName == "xyz") {
			System.out.println("userName is correct");
			if (password == "123456") {
				System.out.println("password is correct");
			} else {
				System.out.println("wrong password");
			}

		} else {
			System.out.println("wrong userid");
		}
	}

}
