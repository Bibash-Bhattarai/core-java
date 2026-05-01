package looping;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		
		int n , s = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		
		while(n>0) {
			
			int t = n % 10;
			s = s * 10 + t;
			n = n/10;
			
		}

		
		
		
		System.out.println("the reverse of the given number is: "+ s);
		
	}
}
