package kr.hs.dgsw.java.dept23.d0414;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("�۸�");
	}
	
	public static void main(String[] args) {
		
		Animal dog = new Dog("����");
		dog.move();
		dog.eat("���");
		dog.makeSound();
	}
}
