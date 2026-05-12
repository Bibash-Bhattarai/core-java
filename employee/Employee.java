package employee;
import java.text.NumberFormat;
import java.util.Locale;

public class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	Employee(int empId, String name, String ssn, Double salary){
		
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) {
			System.out.println("Name cannot be empty");
			return;
		}
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double increase) {
		
		if(increase<0) {
			System.out.println("\nRaise Salary cannot be negative");
			return;
		}
		
		salary += increase;
	}
	
	void printEmployee() {
				
		System.out.println("\nEmployee Id = "+ empId);
		System.out.println("Employee Name = "+ name);
		System.out.println("Employee ssn = "+ ssn);
		
		String formattedSalary =
	            NumberFormat.getCurrencyInstance(Locale.US)
	                        .format((double) getSalary());

		System.out.println("Salary = "+ formattedSalary);
	}
}
