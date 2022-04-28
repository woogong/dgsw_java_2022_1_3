package kr.hs.dgsw.java.dept23.d0421;

public class Triangle extends Rectangle {

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public String getType() {
		return "»ï°¢Çü";
	}
	
	@Override
	public double getArea() {
		return super.getArea() / 2;
	}
}
