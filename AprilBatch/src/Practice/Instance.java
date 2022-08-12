package Practice;

public class Instance {

	
 static int a= 25;

public  void m1(int b) {
	this.a=b;
	
}
	public static void main(String[] args) {
		//System.out.println(a);
		Instance p1 = new Instance();
		
		System.out.println(p1.a);
		p1.m1(30);
		System.out.println(p1.a); 
		Instance p2 = new Instance();
		System.out.println(p2.a);
		//System.out.println(Practicle.a);
		
		Instance p3 = new Instance();
		System.out.println(p3.a);
		p3.m1(35);
		System.out.println(p3.a);
		System.out.println(p3.a);  
	}

} 
