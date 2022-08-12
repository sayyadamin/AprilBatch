package method;

public class Calc {

	public static void main(String[] args) {

		int k = sum(); // o/p of sum mtd store in m variable
		System.out.println("sum of two no = " + k);

		Calc c1 = new Calc();
		int m = c1.sub(); // o/p of sub mtd store in m variable
		System.out.println("sub of two no = " + m);

		System.out.println("mult of two no = " + k * m); // new created variable use for next fun.
		System.out.println("div of two no = " + k / m);

	}

	public static int sum() {
		int a = 25;
		int b = 35;
		int sum = a + b;
		return sum;
	}

	public int sub() {
		int c = 75;
		int d = 45;
		int sub = c - d;
		return sub;
	}
}

// return type use for store method value in a variable ,& this variable use in next opration 
