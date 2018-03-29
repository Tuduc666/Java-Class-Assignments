/*
 * 6. Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7. 
 * The expressions are to be typed in by the user. The input always consist of a number, 
 * followed by an operator, followed by another number. The operators that are allowed are +, -, *, and /. 
 * Your program should read an expression, print its value, read another expression, print its value, 
 * and so on. 
 * The program should end when the user enters 0 as the first number on the line.
 */

import java.util.Scanner;
public class Assignment002f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		String symbol;
		boolean error = false;
		
		System.out.println("Enter a simple expression such as 17 + 3. Valid operators are + - * /");

		
		for ( ; ; ) {
			num1 = sc.nextDouble();
			if (num1 == 0.0) break;
			symbol = sc.next();
			num2 = sc.nextDouble();
			double total = 0;
			switch (symbol){
				case "+":
					total = num1 + num2;
					break;
				case "-":
					total = num1 - num2;
					break;
				case "*":
					total = num1 * num2;
					break;
				case "/":
					total = num1 / num2;
					break;
				default:
					error = true;
				}

		if (!error)	
			System.out.println(total);
		else	
			System.out.println("Invalid operator entered");
		}
	}

}
