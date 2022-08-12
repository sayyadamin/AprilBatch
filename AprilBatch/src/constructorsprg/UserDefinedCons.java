package constructorsprg;

public class UserDefinedCons {
	String name;
	int age;
	UserDefinedCons (String x , int y) {
	name=x;
	age=y;
	}
	public void print(){
		System.out.println(name+" " + " " +age);
		
	}


	public static void main(String[] args) {
		UserDefinedCons user1 = new UserDefinedCons( "amin", 27 );
		user1.print();
		UserDefinedCons user2 = new UserDefinedCons( "muhhamad", 3 );
		user2.print();
	}

}
