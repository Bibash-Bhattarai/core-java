package employee;

public class Director extends Manager{
	
	private double budget;
	
	Director(int empId, String name, String ssn, double salary, String deptName, double budget){
	
		super(empId, name, ssn, salary,deptName);
		this.budget = budget;
	}
	
	public double getbudget() {
		return budget;
	}
	
	void printbudget() {
		
		super.printdeptName();
		System.out.println("Budget = "+ budget);
		
	}

}
