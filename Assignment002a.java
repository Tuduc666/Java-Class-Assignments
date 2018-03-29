/*
 * 1. The Legendary FizzBuzz

Write a program that prints the numbers from 1 to 100. 
But for multiples of three print "Fizz" instead of the number.
For the multiples of five print "Buzz". 
For numbers which are multiples of both three and five print "FizzBuzz".

 */

public class Assignment002a {

	public static void main(String[] args) {

		for (int i=1; i<=100;i++) {	

		    // check for multiple of 3 and 5
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			}
			
		    // check for multiple of 3
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			
		    // check for multiple of 			
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}

		    // otherwise just print the number 			
			else {
				System.out.println(i);
			}
		}

	}
}

	
