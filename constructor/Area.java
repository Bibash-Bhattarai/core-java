package constructor;

import java.util.Scanner;

public class Area {

	int l;
	int b;
	
	Area(int l,int b){
		
		this.l = l;
		this.b = b;
		
		System.out.println("Area of rectangle is: "+ returnArea());
	}
	
	int returnArea() {
		
		return l*b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle: ");
		int l = sc.nextInt();
		
		System.out.println("Enter the breadth of rectangle: ");
		int b = sc.nextInt();
		
		Area a1 = new Area(l,b);
	}
}
