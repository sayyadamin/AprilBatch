package homeWork;

import java.util.Scanner;

public class DayOfMonth {

	public static void main(String[] args) {

		//int day = 28;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter days");
		String days= sc.nextLine();
for(int i=0; i<=days.length(); i++) { 
		if (i == 31) {
			System.out.println("jan,march,may,july,sep,oct,dec");
		} else if (i == 30) {
			System.out.println("april,jun,august,nov");
		} else if (i == 28) {
			System.out.println("feb");
		} else {
			System.out.println("wrong input");
		}

	}

}
}