package kr.hs.dgsw.java.dept23.d0317;

import java.util.Scanner;

public class DataTypeStudy {

	public void studyInteger() {
		byte byteValue = 122;
		short shortValue = 30000;
		int intValue = 2100000000;
		long longValue = 30000000001L;
	}
	
	public void studyReal() {
		double doubleValue = 1234567890.1234567890;
		float floatValue = 1234567890.1234567890F;
		
		System.out.println(doubleValue);
		System.out.println(floatValue);
	}
	
	public void studyBoolen() {
		boolean bool1 = (3 > 2);
		boolean bool2 = ((1241 * 24) > (2452 * 16));
		
		if (true) {
			// do something
		}
	}
	
	public void studyChar() {
		char ch = 'A';
		char ch2 = 65;
		
		/*
		for (char i = 0 ; i < 256 ; i++) {
			System.out.printf("%04X  %d - %c \n", 
					(int) i, (int)i, i);
		}
		*/
		
		
		int h1 = '가';
		System.out.println(h1);
		
		int count = '힣' - '가' + 1;
		System.out.println(count);
		
		/*
		for (int i = '가' ; i <= '힣' ; i++) {
			System.out.printf("%d - %c\n", i, (char)i);
		}
		*/
		
		int hanja1 = '一';
		int hanja2 = '鳥';
		int hanja3 = '入';
		int hanja4 = '力';
		
		System.out.println(hanja1 + "  " + hanja2 + "  " + 
				hanja3 + "  " + hanja4);
		
	}
	
	
	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		//study.studyReal();
		//study.studyChar();
		Scanner scanner = new Scanner(System.in);
		for (int i = 10000 ; i < 65000 ; i += 100) {
			for (int j = i ; j < i + 100 ; j++) {
				//System.out.println(i + "  " + j);
				System.out.printf("%04X - %c\n", j, (char)j );
			}
			
			String str = scanner.next();
		}
		
		scanner.close();
		
	}
}




