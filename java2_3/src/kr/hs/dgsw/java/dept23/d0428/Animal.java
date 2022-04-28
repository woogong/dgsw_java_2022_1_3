package kr.hs.dgsw.java.dept23.d0428;

public abstract class Animal {

	public abstract String getName();
	
	public abstract String makeSound();
	
	public void move() {
		System.out.printf("%s 이(가) %S 소리를 내며 달려갑니다.\n", 
				getName(), makeSound());
	}

	public static void main(String[] args) {
		Animal animal = new Horse();
		animal.move();
	}
	
}
