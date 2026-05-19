package abstraction;

public abstract class CentralBank {

	abstract void getBankName();
	
	abstract void getInterestRate();
	
	void moneyExRate() {
		
		System.out.println("1$ = Rs. 150");
		System.out.println("1 Yan = Rs. 16");
	}
}
