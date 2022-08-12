package Practice;

public class PalinDrom {
	
	public void pal() {
		
		int num=121;
		int temp= num;
		int sum=0;
		int reminder;
		
		while(num>0) {
			reminder=num%10;
			sum=(sum*10)+reminder;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("it is palindrom no");
		}else {
			System.out.println("it is not palindrom");
		}
		
		
	}

	public static void main(String[] args) {
		
		PalinDrom p = new PalinDrom();
		p.pal();
	}

}
