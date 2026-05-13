package inheritancePractice;

public class Manager extends Member{
	
	String department;

	void printManager() {
		
		super.printMember();
		System.out.println("Department = "+ department);
	}
	
	

}
