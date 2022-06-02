package kr.hs.dgsw.java.dept23.d0602;

public class DepositThread implements Runnable {

	private final Bank bank;
	
	private final int amount;
	
	public DepositThread(Bank bank, int amount) {
		this.bank = bank;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		System.out.printf("%s ���¿� %d���� �����մϴ�.\n", "ȫ�浿", amount);
		bank.deposit("ȫ�浿", amount);
	}
	
}
