package constructorsprg;

public class Default {
     int a ;
     int b;
     
	Default(){
		a=45;   
		b=38;
		
	}
	public  void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Default d = new Default();
		d.m1();
	}

}
