package arrays;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		String sub[]= new String[5];
		int mark[]= new int[5];
		int total =0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<mark.length;i++) {
			System.out.println("Enter the name of subject and marks : ");
			sub[i]= sc.next();
			mark[i]= sc.nextInt();
		}
		
		for(int x : mark) {
			total += x;
		}
		System.out.println("Total marks : "+ total);
		double per = total * 0.20;
		System.out.println("Percentage : "+ per+"%");
	}
}
