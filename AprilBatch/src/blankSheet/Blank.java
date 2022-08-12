package blankSheet;

public class Blank {
	
	public static void m1(){
		int num=10;
		int count =0;


	for(int i=1;i<=num;i++){

	if(num%i==0){
	count++;
	}

	}
	if(count==2){
	System.out.println("its prime no");
	}else{
	System.out.println("its not prime");
	}
	}
	public static void main(String[]arg){
	 m1();
	}
		

}
