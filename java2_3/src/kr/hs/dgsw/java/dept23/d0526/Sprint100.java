package kr.hs.dgsw.java.dept23.d0526;

public class Sprint100 {

	public static class Athlete implements Runnable {

		private final String name;
		
		private final double record;
		
		public Athlete(String name, double record) {
			this.name = name;
			this.record = record;
		}
		
		@Override
		public void run() {
			int times = 0;
			double distance = 0;
			
			while (true) {
				distance = times * (100 / record);
				System.out.printf("%s ������ %d�� ���� %.2fm�� �޷Ƚ��ϴ�.\n", 
						name, times, distance);
				
				if (distance >= 100) {
					break;
				}
				
				times++;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
	}
	
	public void playGame() {
		Athlete bolt = new Athlete("����κ�Ʈ", 9.58);
		Athlete kim = new Athlete("�豹��", 10.07);
		Athlete ji = new Athlete("����", 12.56);
		Athlete student = new Athlete("���", 14.02);
		
		new Thread(student).start();
		new Thread(ji).start();
		new Thread(kim).start();
		new Thread(bolt).start();
	}
	
	public static void main(String[] args) {
		Sprint100 game = new Sprint100();
		game.playGame();
	}
}







