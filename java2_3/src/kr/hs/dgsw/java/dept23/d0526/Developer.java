package kr.hs.dgsw.java.dept23.d0526;

public class Developer implements Job {

	@Override
	public void work() {
		System.out.println("���α׷� �����ڰ� ���α׷��� �����մϴ�.");
	}
	
	@Override
	public int getPrice() {
		return 20000;
	}

	public static void main(String[] args) {
		Job abcd = new Developer();
	}
}
