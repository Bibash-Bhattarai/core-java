package looping;

public class ForTest {
	
	public static void main(String[] args) {
		
		int sum =0;
		int evensum = 0;
		int oddsum = 0;
		
		for(int i = 1; i<=100; i++) {
			
			sum += i;
		}
	
		System.out.println("The sum of number from 1 to 100 is : "+ sum);
	

		for(int j=1; j<=100; j++) {
			if(j%2 == 0) {
				evensum += j;
			}
			else {
				oddsum += j;
			}
		}
		System.out.println("Sum of even numbers is: "+ evensum);
		System.out.println("The sum of odd numbers is: "+ oddsum);
		
		
	}
	

}
