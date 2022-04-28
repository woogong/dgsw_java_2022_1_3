package kr.hs.dgsw.java.dept23.d0414;

public class Pormeranian extends Dog {

	public Pormeranian() {
		super("포메라니안");
	}
	
	public static void main(String[] args) {
		Animal pormeranian = new Pormeranian();
		
		pormeranian.move();
		pormeranian.eat("개껌");
		pormeranian.makeSound();
		
		
	}
}
