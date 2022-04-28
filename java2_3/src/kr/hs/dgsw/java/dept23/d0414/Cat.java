package kr.hs.dgsw.java.dept23.d0414;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("�߿˾߿�");
	}
	
	public static void main(String[] args) {
		Animal cat = new Cat("����");
		
		cat.move();
		cat.eat("����");
		cat.makeSound();
	}
}
