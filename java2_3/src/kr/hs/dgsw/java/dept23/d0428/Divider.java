package kr.hs.dgsw.java.dept23.d0428;

public class Divider extends Calculator {

	@Override
	public int calculate() {
		return value1 / value2;
	}

	@Override
	public String getOperator() {
		return "/";
	}
	
	@Override
	public boolean isExitCondition() {
		return (value2 == 0);
	}

	public static void main(String[] args) {
		Calculator divider = new Divider();
		divider.execute();
	}
	

}
