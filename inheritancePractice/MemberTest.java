package inheritancePractice;

public class MemberTest {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.name = "John";
		e.age = 32;
		e.phone = "9878654567";
		e.address  = "Kathmandu";
		e.salary = 78000.00;
		e.specialization = "Networking";
		
		e.printEmployee();
		
		Manager m = new Manager();
		
		m.name = "Hari";
		m.age = 24;
		m.phone = "9845637289";
		m.address = "Khotang";
		m.salary = 87000.89;
		m.department = "Marketing";
		
		m.printManager();
	}
}
