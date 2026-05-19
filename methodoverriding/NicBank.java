package methodoverriding;

public class NicBank extends CentralBank{
	
	@Override
	void getBankName() {
	
		System.out.println("NIC Asia Bank");
	}
	
	@Override
	void getInterestRate() {
	
		System.out.println("15%");
	}

}
