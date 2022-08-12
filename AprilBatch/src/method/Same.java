package method;

public class Same {
	public static void m1() {
		System.out.println(" we are static method in same class");
	}

	public void m2() {
		System.out.println("we are non static method in same class");
	}

	public static void main(String[] args) {
		m1();
		Same s = new Same();
		s.m2();
		Differant.m3();
		Differant d = new Differant();
		d.m4();

	}

}

class Differant {

	public static void m3() {
		System.out.println(" we are static method from differant class");
	}

	public void m4() {
		System.out.println("we are non static method in differant class");
	}
}