package kr.hs.dgsw.java.dept23.d0519;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {

	private final Scanner scanner;
	
	public Divider() {
		this.scanner = new Scanner(System.in);
	}
	
	private int calculate(int value1, int value2) {
		return value1 / value2;
	}
	
	public void execute() {
		
		try {
			System.out.println("�� ������ �Է��ϼ���.");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int result = calculate(value1, value2);
			System.out.printf("%d / %d = %d\n", value1, value2, result);
			
			// ���İ� ����� ���Ϸ� �����Ѵ�.
			boolean saved = 
					saveResult("C:/90_ETC/javaStudy/divide.txt", value1, value2, result);
			System.out.println("���� ���� ��� : " + saved);
			
			System.out.println("���α׷��� �����մϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			scanner.close();
		}
		
		/*catch (Exception e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.  " + e);
			
			if (e instanceof InputMismatchException) {
				System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���.");
			} else if (e instanceof ArithmeticException) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}*/
	}
	
	private boolean saveResult(String filePath, int value1, int value2,
			int result) {
		
		String str = String.format("%d / %d = %d\n", value1, value2, 
				result);

		OutputStream os = null;
		try {
			File file = new File(filePath);
			os = new FileOutputStream(file);
			os.write(str.getBytes());
			
			return true;
		} catch (IOException e) {
			System.out.println("���Ͽ� ������ �� �����ϴ�.");
		} finally {
			System.out.println("�ڿ��� �����մϴ�.");
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {} 
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		new Divider().execute();
	}
	
}
