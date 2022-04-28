package kr.hs.dgsw.java.dept23.d0414;

public class Animal {

	protected final String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println(name + "��(��) �پ�ٴմϴ�.");
	}
	
	public void eat(String food) {
		System.out.println(name + "��(��) " + food + "��(��) �Խ��ϴ�.");
	}
	
	public void makeSound() {
		System.out.println("");
	}
}
