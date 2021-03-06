/*
 * 5. Create a JAVA program to write the even numbers from 10 to 20, both included, except 16, in 3 different ways: 

- Incrementing 2 in each step (use "continue" to skip 16) 
- Incrementing 1 in each step (use "continue") 
- With and endless loop (using "break" & "continue") 



 */


public class Assignment002e {

	public static void main(String[] args) {
		
		System.out.println("For loop - increment by 2, use continue");
		for (int i=10;i<=20;i+=2) {
			if (i==16) continue;			
			System.out.println(i);
		}
		
		System.out.println("For loop - increment by 1, use continue");
		for (int i=10;i<=20;i++) {
			if (i % 2 == 1 || i==16 ) continue;
			System.out.println(i);

		}
		
		System.out.println("Infinite loop - increment by 2, use continue & break");
		for (int i=10; ;i+=2) {
			if (i>20) break;
			if (i==16) continue;
			System.out.println(i);
		}
	}
}
