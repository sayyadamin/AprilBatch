package Practice;

public class Vowels {
	
			

	public static void main(String[] args) {

		String str = "my name is Amin";            // string 
		int count = 0;
		                                                           // charactorsofstr is variable of char
		char[] ch = str.toLowerCase().toCharArray();     // string to array conversion
		System.out.println(ch);

		for (int i=0; i < ch.length; i ++) {               // for loop for repetation
			
		if (ch[i]=='a'||ch[i]=='i'||ch[i]=='e'   //continal staement
				||ch[i]=='o'||ch[i]=='u') {
			count++;
			
		}
		}
		System.out.println("number of vowels in above sentence=" +count);
	}

}
