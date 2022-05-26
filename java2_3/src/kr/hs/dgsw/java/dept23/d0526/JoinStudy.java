package kr.hs.dgsw.java.dept23.d0526;

import java.util.Random;

public class JoinStudy implements Runnable {

	@Override
	public void run() {
		System.out.println("�ڽ� �����尡 ���� �����մϴ�.");
		try {
			Thread.sleep(new Random().nextInt(3000) + 100000);
		} catch (InterruptedException e) {}
		System.out.println("�ڽ� �����尡 ���� ����Ĩ�ϴ�.");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("���� �����尡 �����մϴ�.");
		
		Thread child = new Thread(new JoinStudy());
		child.setDaemon(true);
		child.start();
		
		/*
		try {
			child.join();
		} catch (InterruptedException e) {
		}
		*/
		
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
	
	
}
