package Concepts.Threads;


class Counter{
	
	int count;
	
	synchronized void increment(){ // synchrozied is thread safe...at a time one thread will execute this method
		count++;
	}
}
public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread( () ->  {
			for(int i=1; i<=1000; i++) {
				c.increment();
			}
		});
		Thread t2 = new Thread( () ->  {
			for(int i=1; i<=1000; i++) {
				c.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}
