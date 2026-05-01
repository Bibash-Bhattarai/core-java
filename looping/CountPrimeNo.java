package looping;

import java.util.Scanner;

public class CountPrimeNo {

	public static void main(String[] args) {
		
		int x, y;
		int n =0 ;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of number:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		do
			
		{
		for(int i = 2; i<= x; i++) {
			
			if(x % i == 0)
				count ++;
			
		}
		if(count==1) {
			System.out.println(x);
			n++;
		}
		
		count = 0;
		x++;
	}while(x <= y);
		
		System.out.println("No of prime numbers between the given range is : "+ n);
	}
	
}
