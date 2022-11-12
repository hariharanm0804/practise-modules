package Concepts.Java8;

import java.util.Scanner;

public class CustomException {
   public static void main(String[] args) {
	  int i, j;
	  
//	  i= 7;
//	  j = 8;
	  
	  Scanner sc = new Scanner(System.in); // user input by using Scanner class
	  i = sc.nextInt();
	  j = sc.nextInt();
		  try {
			  if(i/j == 0) {
			    throw new CustomArithException("It returns Zerp");
			  }else {
				  System.out.println(i/j);
			  }
		} catch (CustomArithException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
}
}  
