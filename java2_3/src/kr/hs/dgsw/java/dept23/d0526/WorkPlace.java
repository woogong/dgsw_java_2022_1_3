package kr.hs.dgsw.java.dept23.d0526;

public class WorkPlace {

	public void doWorking(Job job, int hours) {
		for (int i = 0 ; i < hours ; i++) {
			job.work();
		}
		
		int salary = hours * job.getPrice();
		System.out.printf("�޷Ḧ %d�� �޾ҽ��ϴ�.", salary);
	}
	
	public static void main(String[] args) {
		Job develper = new Developer();
		Job son = new Sonheongmin();
		Job student = new Student();
		
		WorkPlace workPlace = new WorkPlace();
		workPlace.doWorking(student, 16);
		workPlace.doWorking(develper, 8);
		workPlace.doWorking(son, 6);
	}
	
}
