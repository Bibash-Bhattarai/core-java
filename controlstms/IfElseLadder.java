package controlstms;

import java.util.Scanner;

public class IfElseLadder {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the marks: ");
		double marks = sc.nextDouble();
		
		if(marks>= 80) {
			System.out.println("Grade : A+");
		}
		
		else if (marks>=70) {
			System.out.println("Grade : A");
		}
		else if(marks>=60) {
			System.out.println("Grade : B+");
		}
		else if(marks >=50){
			System.out.println("Grade : B");
		}
		else if(marks>=40) {
			System.out.println("Grade : C");
		}
		else {
			System.out.println("Fail");
		}
	}

}
