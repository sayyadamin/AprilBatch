package Practice;

public class FibonnaciSeries {
	public static void fibonnci() {
		int series=10 ,a=0,b=1,c;
		
		for(int i=1;i<=series;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) {
		fibonnci();

	}

}
