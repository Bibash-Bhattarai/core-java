package looping;

public class JumpingTest {
	
	/*
	 * a. break : exit from the loop
	 * b. continue : skip values
	 * c. return : exit from the method
	 */

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			
			if(i == 5 || i == 8)
				break;
			// continue;
			// return;
			
			System.out.println(i);
		}
		System.out.println("End of loop.");
	}
}
