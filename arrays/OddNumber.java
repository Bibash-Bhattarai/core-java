package arrays;

public class OddNumber {

	public static void main(String[] args) {
		
		int numb[] = new int[50];
		int index = 0;
		
		for(int j = 1; j<=100; j++) {
		
			if(j%2 != 0) {
				numb[index]=j;
				index ++;
			}
		}
		
		System.out.println("Odd number from 0 To 100 are: ");
		for(int x : numb) {
			System.out.print(x +" ");
		}

	}		
}
	
	
