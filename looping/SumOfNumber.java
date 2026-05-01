package looping;

import java.util.Scanner;

public class SumOfNumber {
	
	public static void main(String[] args) {
		
		int n;
		int s = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		while(n>0) {
			
			int t = n % 10;
			s += t;
			n = n / 10;
		}
		
		System.out.println("the sum of the individual no from given number is: "+ s);
	}

}
