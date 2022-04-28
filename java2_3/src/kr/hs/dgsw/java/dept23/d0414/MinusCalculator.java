package kr.hs.dgsw.java.dept23.d0414;

public class MinusCalculator extends PlusCalculator {
	
	public int calculate() {
		return this.value1 - this.value2;
	}
	
	@Override
	public String getOperator() {
		return "-";
	}
	
	public static void main(String[] args) {
		MinusCalculator calculator = new MinusCalculator();
		calculator.execute();
		
	}
}
