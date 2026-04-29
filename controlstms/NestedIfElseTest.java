package controlstms;

public class NestedIfElseTest {
	
	public static void main(String[] args) {
		
		String citizen = "nepali";
		int age =37;
		boolean voterid= false;
		
		if(citizen.equals("nepali")) {
			
			if(age>=18) {
				
				if(voterid==true) {
				System.out.println("Eligible for voting");
				}else {
					System.out.println("You must have voter id.");
				}
			}
			else {
				System.out.println("Not eligible for voting");
			}
		}else {
			System.out.println("Only Nepali citizen is eligible to vote.");
		}
	}

}
