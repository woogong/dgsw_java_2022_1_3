package kr.hs.dgsw.java.dept23.d0331;

public class Sum {

	public int calculateSum(int n) {
		return calculateSum(1, n);
	}
	
	public int calculateSum(int m, int n) {
		int sum = 0;
		
		for (int i = m ; i <= n ; i++ ) {
			sum += i;
		}
		
		return sum;
	}
	
}
