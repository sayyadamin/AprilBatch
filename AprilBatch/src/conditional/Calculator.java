package conditional;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1, num2;
		int output;
		String op;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter oprator");
		op = sc.nextLine();
		System.out.println("enter num1");
		num1 = sc.nextInt();
		System.out.println("enter num2");

		num2 = sc.nextInt();

		/*
		 * int num1=35 ,num2=40; int output ;
		 */
		// char op = '-';

		switch (op) {
		case "+":
			output = num1 + num2;
			System.out.println(output);
			break;
		case "-":
			output = num1 - num2;
			System.out.println(output);
			break;
		case "/":
			output = num1 / num2;
			System.out.println(output);
			break;
		case "*":
			output = num1 * num2;
			System.out.println(output);
			break;
		default:
			System.out.println("wrong input");

		}

	}

}
