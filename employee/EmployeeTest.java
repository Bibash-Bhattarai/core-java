package employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Engineer e = new Engineer(101,"Jane Smith", "012-34-5678", 120345.27);
		e.printEmployee();
		
		Manager m = new Manager(207, "Barbar Johnson", "054-12-2367", 109501.36,"US Marketing");
		m.raiseSalary(500.22);
		m.setName("Bibash");
		m.printdeptName();
		
		Admin a = new Admin(304,"Bill Mumroe", "108-23-6509", 75002.34);
		a.printEmployee();
		
		Director d = new Director(12, "Susan Wheeler","099-45-2340",120567.36,"Global Marketing",1000000.00);
		d.printbudget();
	}
}
