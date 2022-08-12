package Practice;

import java.util.Scanner;

public class Vowels_2 {

	public void getVowels() {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter sentence");

		String str = sc.nextLine();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);

			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
				System.out.println("vowels Present = " + ch + " index of vowels= " + i);
				count++;
				
			}

		}
		System.out.println(" total no of vowels = "+ count);
		

	}

	public static void main(String[] args) {

		Vowels_2 v = new Vowels_2();
		v.getVowels();

	}

}
