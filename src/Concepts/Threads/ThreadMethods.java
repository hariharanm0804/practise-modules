package Concepts.Threads;

public class ThreadMethods {
	 public static void main(String[] args) {
		  Thread t1 = new Thread(
				  () -> {
						for(int i=1;i<=5;i++) {
							System.out.println("Hello");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
			  }, "HelloThread");
		  Thread t2 = new Thread(
				  () -> {
						for(int i=1;i<=5;i++) {
							System.out.println("Hi");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
			  }, "HiThread");
//		  t1.setName("HelloThread");
//		  t2.setName("HiThread");
		  
		  t1.setPriority(Thread.MIN_PRIORITY);
		  t2.setPriority(Thread.MAX_PRIORITY);
		  
		  System.out.println(t1.getPriority());
		  System.out.println(t2.getPriority());
		  
		  System.out.println(t1.getName());
		  System.out.println(t2.getName());
		  
		  
		  t1.start();
		  try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  t2.start();
		  
		  try {
			t1.join(); // joining the thread after thread process complete
			t2.join();
		  } catch (InterruptedException e) {
		  }
		  System.out.println(t1.isAlive()); // check thread status running or not
		  
		  System.out.println("Bye");
	}
}

