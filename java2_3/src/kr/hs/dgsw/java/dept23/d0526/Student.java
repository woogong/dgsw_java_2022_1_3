package kr.hs.dgsw.java.dept23.d0526;

public class Student implements Job, Expert {

	@Override
	public void work() {
		System.out.println("�л��� ���θ� �մϴ�.");
	}

	@Override
	public int getPrice() {
		return 0;
	}
	
	@Override
	public void enjoy() {
		System.out.println("�л��� �ö����� �������� ��̻�� �н��ϴ�.");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		Job job = (Job)student;
		Expert expert = (Expert)student;
	}
}
