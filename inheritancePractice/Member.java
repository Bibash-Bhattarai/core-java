package inheritancePractice;

public class Member {

	String name;
	int age;
	String phone;
	String address;
	double salary;
	
	void printMember() {
		System.out.println("\nName = "+name);
		System.out.println("Age = "+ age);
		System.out.println("Phone Number = "+ phone);
		System.out.println("Address = "+ address);
		System.out.println("Salary = "+ salary);
	}
	
	void printSalary() {
		
		System.out.println("Salary of the member is: "+ salary);
	}
}
