package Concepts.Threads;

class Hii implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Helloo implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class RunnableDemo {
	 public static void main(String[] args) {
		  Hii hi = new Hii();
		  Helloo hello = new Helloo();
		  
		  Thread t1 = new Thread(hi);
		  Thread t2 = new Thread(hello);
		  t1.start();
		  try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  t2.start();
	}
}
