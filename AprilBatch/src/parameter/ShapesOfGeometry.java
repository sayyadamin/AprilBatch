package parameter;

public class ShapesOfGeometry {

	public void shapes(int i) {
		if (i == 0) {
			System.out.println(" no shape");
		} else if (i == 1) {
			System.out.println("it is line");
		}

		else if (i == 2) {
			System.out.println("it is angle");
		} else if (i == 3) {
			System.out.println("it is trangle");
		} else if (i == 4) {

			System.out.println("it is rectangle");
		} else {
			System.out.println("no of side");
		}
	}

	public static void main(String[] args) {

		ShapesOfGeometry s1 = new ShapesOfGeometry();
		s1.shapes(0);
		s1.shapes(1);
		s1.shapes(2);
		s1.shapes(3);
		s1.shapes(4);
		s1.shapes(5);
	}

}
