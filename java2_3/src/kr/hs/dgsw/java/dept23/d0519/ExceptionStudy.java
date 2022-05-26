package kr.hs.dgsw.java.dept23.d0519;

public class ExceptionStudy {

	public void method1() throws MyException {
		
		System.out.println("method1 ȣ���");
		
		// ���ܸ� �߻����� ���ô�.
		MyException exception = new MyException();
		throw exception;
	}
	
	public void method2() {
		try {
			method1();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public void method3() {
		MyRuntimeException exception = new MyRuntimeException();
		throw exception;
	}
	
	public static void main(String[] args) {
		new ExceptionStudy().method2();
	}
	
}
