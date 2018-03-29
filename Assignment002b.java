/*
 * 2. The Halving Machine

Create a loop that will take an integer from user input.
If the integer is odd, add 1 and then divide that by 2 and print the new number.
If the integer is even, just divide by 2 and print the new number.
Continue doing this until you reach 1.

If the user enters 0 or negative number, print out "HEY! That's against the rules." and end the program.

 */


import java.util.Scanner;
public class Assignment002b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("Please enter an integer");
		input = sc.nextInt();
		
		while (input > 1) {
		if (input % 2 == 1) {
			System.out.println((input+1)/2);
		}
		else {
			System.out.println(input/2);
		}
		input -= 1;
		}
	}
}
