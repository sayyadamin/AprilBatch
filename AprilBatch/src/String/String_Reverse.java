package String;

public class String_Reverse {

	public static void main(String[] args) {
		String st = "altmash";
		System.out.println(st);
		for (int i = st.length() - 1; i > 0; i--) {
			 System.out.print( st.toUpperCase().charAt(i));
			 
		}
		System.out.println("         ");
		String s = "aba";

		if (s.charAt(0) == s.charAt(2)) {
            
			System.out.println(s+"  its pallindrom");

		} else {
			System.out.println("it is not pallindrom");
		}
		

	}

}
