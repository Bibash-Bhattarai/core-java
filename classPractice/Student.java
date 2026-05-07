package classPractice;

public class Student {

	
	String name;
	int roll_no;
	
	void printStd() {
		
		System.out.println("Name of student is : "+ name);
		System.out.println("Roll Number is : "+ roll_no);
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name = "John";
		s.roll_no = 2;
		
		s.printStd();
	}
}
