package Concepts.Threads;

/**
 * 
 * @author Hariharan
 *
 */
class MyThread extends Thread{
	int[] values = {5,7,8,9,3};
	
	public void run() {
		for(int i=0; i< values.length; i++) {
			values[i] = values[i]*2;
		}
	}
}
public class ThreadDemo {
  public static void main(String[] args) {
	  MyThread m1= new MyThread();
	  m1.start();
	  for(int value: m1.values) {
		  System.out.print(value + " ");
	  }
	  
} 
}
