package Concepts.Interview;

public class StringExample {
	
	public static void main(String[] args) {
		String s1= "ABC";
		String s2= new String("ABC");
		String s3= s1;
		String s4 = "ABC";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s4);
	}
 
	
}
  