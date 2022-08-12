package method;

public class Demo {

	public static void main(String[] args) {                            // main method

		System.out.println("we are in main method");
		m1();                                                         // static m1 mtd. call (same class diff. mtd)

		Demo d1 = new Demo();                                       // object creation
		d1.m2();                                                   // non static m2 mtd call(same class diff mtd)

	}

	public static void m1() {                                     // regular static mtd.
		System.out.println("we are in regular satic method");
	}

	public void m2() {                                              // regular non static mtd.
		System.out.println("we are in regular non satic method");
	}

}
//notes
//1. main mtd call by compiler
//2.types of mtd 1)main method 2)regular method
//3.regular method again two type  1) static 2)non static
//4.static mtd. denoted by static keyword
//5.static mtd in same class call in main mtd. by call mtd name e.g m1();
//6.non static mtd does not use static keywords
//7.non static method call in same class by using ceating object, object create by new kewords
//   then objname.mtdname();