package classPractice;

import java.util.Scanner;

public class AddFeetInch {

	int d1Feet, d1Inch,d2Feet ,d2Inch;
	
	void getDistance(int d1Feet,int d1Inch,int d2Feet, int d2Inch) {
		
		this.d1Feet= d1Feet;
		this.d1Inch = d1Inch;
		this.d2Feet = d2Feet;
		this.d2Inch = d2Inch;
		
		addDistance();
	}
	
	void addDistance() {
		
		int f = d1Feet + d2Feet;
		
		int i = d1Inch + d2Inch;
		
		int inchFeet = i/12;
		
		f +=inchFeet;
		
		int e = i % 12;
		
		System.out.println("The added distance is : "+f+"ft "+e+"inch");
		
	}
	
	public static void main(String[] args) {
		
		AddFeetInch a = new AddFeetInch();
		a.getDistance(5,4,6,10);
	}
}
