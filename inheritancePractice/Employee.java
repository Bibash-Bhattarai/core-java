package inheritancePractice;

public class Employee extends Member{
	
	String specialization;

	void printEmployee() {
		
		super.printMember();
		System.out.println("Specialization = "+ specialization);
	}

}
