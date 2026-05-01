package looping;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int n;
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		for(int i = 2; i<=n; i++) {
			
			if(n % i == 0)
				count ++;
				
		}
		if(count == 1)
			System.out.println("Prime number.");
		
		else
			System.out.println("Not Prime number.");
		
		
	}
}
