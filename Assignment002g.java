/*
 * 
7. Create a program using nested loops that would generate the following output:
1.
	88888888
    88888888
    88888888
    88888888
    88888888
2.
		8888
        888
        88
        8
3. 
		8
       8
      8
     8
    8
   8


 */



public class Assignment002g {

	public static void main(String[] args) {
		// example 1
		for (int i=0;i<5;i++) {
			for (int j=0;j<8;j++) {
				System.out.print("8");
			}
			System.out.println("");
		}
		
		// example 2
		int a=4;
		for (int i=0;i<4;i++) {
			for (int j=0;j<a;j++) {
				System.out.print("8");
			}
			System.out.println("");
			a--;
		}
		
		// example 3
		int b=7;
		for (int i=0;i<8;i++) {
			for (int j=0;j<=b;j++) {
				if (j==b)
					System.out.print("8");
				else
					System.out.print(" ");
			}
			System.out.println("");
			b--;
		}
	}
}
