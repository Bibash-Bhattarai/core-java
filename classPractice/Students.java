package classPractice;

public class Students {

	
	String name;
	int roll_no;
	long phoneNo;
	String address;
	
	void printStd() {
		
		if(name == "Sam" || name == "John") {
			
			System.out.println("\nName of student : "+ name);
			System.out.println("Roll Number : "+ roll_no);
			System.out.println("Phone Number : "+ phoneNo);
			System.out.println("Address : "+ address);
			
		}
	}
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		
		s1.name = "Sam";
		s1.roll_no = 4;
		s1.phoneNo = 9856743456l;
		s1.address = "Kathmandu";
		
		s1.printStd();
		
		Students s2 = new Students();
		
		s2.name = "John";
		s2.roll_no= 8;
		s2.phoneNo = 9845637281l;
		s2.address = "Chitwan";
		
		s2.printStd();
	}
}
