package classPractice;

import java.util.Scanner;

public class Area {

	
	int length;
	int breadth;
	
	void setDim() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle : ");
		length = sc.nextInt();
		
		System.out.println("Enter the breadth of rectangle : ");
		breadth = sc.nextInt();
	}
	
	int getArea() {
		
		
		int area = length * breadth;
		
		return area;
		
	}
	
	public static void main(String[] args) {
		
		Area a = new Area();
		
		a.setDim();
		int area = a.getArea();
		
		System.out.println("Area of rectangle is: "+ area);
	}
}
