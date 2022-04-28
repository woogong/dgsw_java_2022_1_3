package kr.hs.dgsw.java.dept23.d0428;

import java.util.Scanner;

public abstract class Calculator {
	protected final Scanner scanner;
	
	protected int value1;
	
	protected int value2;
	
	public Calculator() {
		this.scanner = new Scanner(System.in);
	}

	public void execute() {
		// �� ������ �Է� �޴´�.
		this.inputValues();
		
		// ����� �����Ѵ�.
		int result = this.calculate();
		
		// ����� ����Ѵ�.
		this.showResult(result);
		
		this.scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

	public void inputValues() {
		System.out.println("�� ������ �Է��ϼ���.");
		this.value1 = this.scanner.nextInt();
		this.value2 = this.scanner.nextInt();
	}

	public abstract int calculate();
	
	public void showResult(int result) {
		System.out.printf("%d %s %d = %d\n", value1, getOperator(), value2,
				result);
	}
	
	public abstract String getOperator();
	
}
