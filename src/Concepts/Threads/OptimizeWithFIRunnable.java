package Concepts.Threads;

public class OptimizeWithFIRunnable {
	 public static void main(String[] args) {
//		  Runnable obj1 = new Runnable() {
//			  public void run() {
//					for(int i=1;i<=5;i++) {
//						System.out.println("Hi");
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//		  };
//		  Runnable obj2 = new Runnable() { 
//			  public void run() {
//					for(int i=1;i<=5;i++) {
//						System.out.println("Hello");
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//		  };
		 
//		 Runnable obj1 = () -> {
//					for(int i=1;i<=5;i++) {
//						System.out.println("Hi");
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//		  };
//		  Runnable obj2 = () -> {
//					for(int i=1;i<=5;i++) {
//						System.out.println("Hello");
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//		  };
		  
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
			  });
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
			  });
		  t1.start();
		  try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  t2.start();
	}
}

