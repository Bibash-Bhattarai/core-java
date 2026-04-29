package datatype;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		double p;
		double t;
		double r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle : ");
		p = sc.nextDouble();
		
		System.out.println("Enter the time period : ");
		t = sc.nextDouble();
		
		System.out.println("Enter the rate :");
		r = sc.nextDouble();
		
		double si = (p * t * r)/100;
		
		System.out.println("The simple interest is : "+ si);
	}

}
