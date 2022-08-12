package Practice;
// instance variable call though method
public class Cars {
	String brand = "cruze";
	int airBags = 4;
	float speed = 120.5f;
	String clr = "levender";

	public void carsSpecification1() {
		System.out.println("my car model " + brand);

	}

	public void carSpecification2() {
		System.out.println("my car having airbags-" + airBags);

	}

	public void carSpecification3() {
		System.out.println("my car high speed -" + speed);
	}

	public String carSpecification4() {
		System.out.println("my car clr-" + clr);
		return "null";

	}

	public static void main(String[] args) {
		Cars c = new Cars();
		c.carsSpecification1();
		c.carSpecification2();
		c.carSpecification3();
		c.carSpecification4();

	}

}
