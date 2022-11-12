package Concepts;


/**
 * 1d Array
 * 2d Array
 * Jagged Array
 * 
 * @author Hariharan
 *
 */

class Student {
	int rollno;
	String name;
}
public class ArrayDemo {
   public static void main(String[] args) {
	   
	
	 /**
	  * 1d Array
	  */
	 int num[] = {30,20,50,70};
	 
	 for(int number: num) {
		 System.out.println(number);
	 }
	 
	 /**
	  * 2d Array
	  */
	 int a[] = {1,2,3,4};
	 int b[] = {6,7,8,9};
	 int c[] = {3,4,5,6};
	 
	 int d[][] = {
			 {1,2,3,4},
			 {6,7,8,9},
			 {3,4,5,6}
	 };
	 
	 for (int i=0;i<3; i++) {
		 for(int j = 0; j<4;j++) {
			 System.out.print(d[i][j] + " ");
		 }
		 System.out.println();
	 }
	 
	 /**
	  * Jagged Array
	  */
	 
	 int e[][] = {
			 {1,2,3,4},
			 {6,7,8,},
			 {3,4,5,6,9}
	 };
	 
	 for (int i=0;i<e.length; i++) {
		 for(int j = 0; j<e[i].length;j++) {
			 System.out.print(e[i][j] + " ");
		 }
		 System.out.println();
	 }
}
}
