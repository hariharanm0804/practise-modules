package Concepts;

public class NestedLoopDemo {
    public static void main(String[] args) {
		/**
		 * Output:
		 * 
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 1 2 3 4 5 6
		 * 
		 */
    	for(int i=0; i<=5;i++) {
			for(int j = 1;j<=i+1;j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
