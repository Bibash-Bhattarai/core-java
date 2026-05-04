package arrays;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		int book[]= new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {
			
			System.out.println("Enter the price of "+ (i+1) +" book :");
			book[i]= sc.nextInt();
		}
		
		int total =0;
		for(int x : book) {
			
			total += x;
				
		}
		int avg = total/10;
		System.out.println("Total price of book is: "+ total);
		System.out.println("Average price of book is : "+ avg);
	}
}
