package kr.hs.dgsw.java.dept23.d0602;

public class Sync {

	private static Object lock = new Object();
	
	public static class Waiter implements Runnable {
		
		public void run() {
			
			System.out.println("waiter started");
			System.out.println("wait for notify");
			
			synchronized (lock) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
				}
			}
			
			System.out.println("waiter resumed");
			
		};
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Waiter());
		Thread thread2 = new Thread(new Waiter());
		Thread thread3 = new Thread(new Waiter());
		thread1.start();
		thread2.start();
		thread3.start();
		
		Thread.sleep(1000);
		
		System.out.println("Main - notify");
		synchronized (lock) {
			lock.notifyAll();
		}
	}
	
	
}
