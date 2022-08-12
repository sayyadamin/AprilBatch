package Practice;

public class Car {
	String clr;

	public Car speci(String clr) {

		Car c = new Car();

		System.out.println(clr);
		return c;
	}

	public static Car speed(int i) {
		
	//Car s = new Car(); 
	System.out.println(i);
	
	return new Car() ;             // Car s = new Car()
	}
	public static void main(String[] args) {

		Car c2 = new Car();
		Car d = c2.speci("yellow");
		 c2.speci("blue");
		 c2.speci("white");
		System.out.println(d);
		
		
		Car a = speed(25);
		speed(23);
		
		
		
		System.out.println(d);
		
	}
	
 
	

	

}
