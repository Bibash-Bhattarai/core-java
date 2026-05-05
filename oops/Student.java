package oops;

public class Student {

	// properties
	
	
	int stdId;
	String stdName;
	String schoolName;
	String batch;
	String faculty;

	// methods
	
	void printStudent() {
		
		System.out.println("Student Id : "+ stdId);
		System.out.println("Student Full Name : "+ stdName);
		System.out.println("School Name : "+ schoolName);
		System.out.println("Batch : "+ batch);
		System.out.println("Faculty : "+ faculty);
	}
}
