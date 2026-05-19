package methodoverriding;

public class Test {

	public static void main(String[] args) {

		// static or early binding of object
		NabilBank nb = new NabilBank();

		nb.getBankName();
		nb.getInterestRate();

		// up-casting

		CentralBank bank = new PrabhuBank();

	}

	// late or dynamic binding of object

	// runtime polymorphism

	void printBankInfo(CentralBank bank) {

		bank.getBankName();
		bank.getInterestRate();
	}

}
