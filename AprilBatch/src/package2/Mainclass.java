package package2;

import Practice.Cars;
import method.Demo;
import package1.Test;
import package1.Testdemo;

public class Mainclass {

	public static void main(String[] args) {
		
		Testdemo.m1();
		
		Testdemo t1 = new Testdemo();

		t1.m2();
		
		Test.m3();
		
		Test t2 = new Test();
		
		t2.m4();
		
		Demo.m1();
		
		Cars c = new Cars();
		c.carsSpecification1();
		c.carSpecification2();
		c.carSpecification3();
		c.carSpecification4();
	}
	

}
