package kr.hs.dgsw.java.dept23.d0414;

public class Student extends People {

	private String classNumber;
	
	private int grade;
	
	public void showInformation() {
		System.out.printf("name : %s,  age : %d, grade : %d\n", 
				name, age, grade);
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "ȫ�浿";
		student.age = 20;
		student.grade = 2;
		
		student.showInformation();
		
		
		People people1 = new People();
		people1.name = "�ں���";
		people1.age = 18;
		
		People people2 = new Student();
		people2.name = "�տ�";
		people2.age = 18;
		
		people1.showInformation();
		people2.showInformation();
		
	}
}
