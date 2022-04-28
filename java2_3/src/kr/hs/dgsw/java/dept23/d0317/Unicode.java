package kr.hs.dgsw.java.dept23.d0317;

import java.util.Scanner;

public class Unicode {

	private ScannerStudy study;
	
	public void printChar(int code) {
		System.out.printf("%d - %c\n", code, (char)code);
	}
	
	public void execute() {
		study = new ScannerStudy();
		study.prepareScanner();
		
		Scanner scanner = study.getScanner();
		while (true) {
			System.out.print("Write char code : ");
			int value = scanner.nextInt();
			if (value == -1) {
				break;
			}
			
			printChar(value);
		}
		
		System.out.println("Program terminated");
		study.closeScanner();
	}

	public static void main(String[] args) {
		Unicode unicode = new Unicode();
		unicode.execute();
	}
}
