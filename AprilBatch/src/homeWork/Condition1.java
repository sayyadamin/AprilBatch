package homeWork;

public class Condition1 {

	public static void main(String[] args) {
		int a=25;
		int b=25;
		if (a==b) {
			System.out.println("ok");
		}

		int m =30;
		
		if(m>65) {
			System.out.println("distinction");
		}else if( m<65&&m>55) {
			System.out.println("first class ");
			
		}else if (m<55&&m>50) {
			System.out.println("second class");
		}else if (m<35 || m==35 ) {
			System.out.println("fail");
		}
	}

}
