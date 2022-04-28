package kr.hs.dgsw.java.dept23.d0331;

public class Aliquot {

	public String findAliquots(int n) {
		StringBuilder buffer = new StringBuilder();
		
		for (int i = 1 ; i <= (n / 2) ; i++) {
			if ((n % i) == 0) {
				buffer.append(i).append(", ");
			}
		}
		
		buffer.append(n);
		
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		
		long check1 = System.currentTimeMillis();
		Aliquot aliquot = new Aliquot();
		String result = aliquot.findAliquots(2000000000);
		System.out.println(result);
		long check2 = System.currentTimeMillis();
		System.out.println(check2 - check1);
		
	}
	
}
