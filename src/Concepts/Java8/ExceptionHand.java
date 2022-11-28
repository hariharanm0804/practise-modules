package Concepts.Java8;

public class ExceptionHand {
   public static void main(String[] args) {
	 try {
		 int j = 8/0;
	 }catch(ArithmeticException e) {
		 System.out.println("AE" + e);
	 }catch(Exception ee) {
		 System.out.println(ee);
	 }
}
}
