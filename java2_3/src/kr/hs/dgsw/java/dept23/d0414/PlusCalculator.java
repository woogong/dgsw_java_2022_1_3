package kr.hs.dgsw.java.dept23.d0414;

import java.util.Scanner;

public class PlusCalculator {
	protected final Scanner scanner;
	
	protected int value1;
	
	protected int value2;
	
	public PlusCalculator() {
		this.scanner = new Scanner(System.in);
	}

	public void execute() {
		/* �� ������ �Է¹޴´�. */
		this.inputNumbers();
		
		/* �Է¹��� ���� ����Ѵ�. */
		int result = this.calculate();
		
		/* ��� ����� ����Ѵ�. */
		this.showResult(result);
		
		/* �ڿ��� �����Ѵ�. */
		this.scanner.close();
	}
	
	public void inputNumbers() {
		System.out.println("������ �� �� �Է��ϼ���.");
		this.value1 = this.scanner.nextInt();
		this.value2 = this.scanner.nextInt();
	}
	
	public int calculate() {
		return this.value1 + this.value2;
	}
	
	public void showResult(int result) {
		System.out.printf("%d %s %d = %d", this.value1, 
				getOperator(),
				this.value2,
				result);
	}
	
	public String getOperator() {
		return "+";
	}

	public static void main(String[] args) {
		PlusCalculator calculator = new PlusCalculator();
		calculator.execute();
		
	}
}
