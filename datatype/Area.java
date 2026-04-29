package datatype;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		double r = sc.nextDouble();
		
		double circle = 3.14 * (r*r);
		System.out.println("The area of the circle is: "+ circle);
		
		System.out.println("enter the length of the rectangle : ");
		int l = sc.nextInt();
		
		System.out.println("Enter the breadth of the rectangle: ");
		int b = sc.nextInt();
		
		int rect = l* b;
		System.out.println("The area of the rectangle is: " + rect);
		
		
	}
}
