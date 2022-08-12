package Practice;

public class Just {
	static int a = 12;

	public void m1() {

		System.out.println(a);
	}

	public static void m2() {

		System.out.println(a);
	}

	public static void main(String[] args) {
		Just j1 = new Just();
		j1.m1();
		m2();

	}

}
