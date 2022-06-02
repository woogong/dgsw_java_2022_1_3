package kr.hs.dgsw.java.dept23.d0602;

public class Consumer implements Runnable {

	private final Buffer buffer;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while (true) {
			
			synchronized (buffer) {
				try {
					buffer.wait();
					int value = buffer.get();
					System.out.println("���� " + value + "�� ó���մϴ�.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
			}
			
		}
		
	}

}
