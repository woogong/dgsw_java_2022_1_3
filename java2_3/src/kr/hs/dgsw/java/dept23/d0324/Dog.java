package kr.hs.dgsw.java.dept23.d0324;

import java.util.Scanner;

import kr.hs.dgsw.java.dept23.d0317.ScannerStudy;

public class Dog {

	private final String name;
	
	private int age;
	
	public Dog() {
		this("����");
		
	}
	
	public Dog(String name) {
		System.out.println("������ ȣ���");
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello " + this.name);
	}
	
	public static void main(String[] args) {

		ScannerStudy scannerStudy = new ScannerStudy();
		scannerStudy.prepareScanner();
		Scanner scanner = scannerStudy.getScanner(); 
 		
		String input = null;
		while (true) {
			System.out.println("������ �̸��� �Է��ϼ���");
			input = scanner.next();
			
			//if (input.equals("quit")) {
			if ("quit".equals(input)) {
				break;
			}
			
			Dog dog = new Dog(input);
			dog.sayHello();
		}
		
		scannerStudy.closeScanner();
	}
	
}
