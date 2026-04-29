package datatype;

import java.util.Scanner;

public class Add {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		// get data from user
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		x = sc.nextInt();
		
		System.out.println("Enter the vslue of y: ");
		y = sc.nextInt();
		
		int s = x+ y;
		 System.out.println("Sum of entered number is: "+ s);
		 
		 int avg = s/2;
		 System.out.println("Average of two number is : " + avg);
		
		
	}
}
