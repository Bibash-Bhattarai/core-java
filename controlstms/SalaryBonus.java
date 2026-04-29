package controlstms;

import java.util.Scanner;

public class SalaryBonus {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double tsalary;
		
		System.out.println("Enter your post: ");
		String post = sc.next();
		
		switch(post) {
		
		case "MD":
			 tsalary = 0.2*230000 + 230000;
			System.out.println("Total salary of the MD is: "+ tsalary);
			break;
		
		case "CEO":
			 tsalary = 0.2579*250000 + 250000;
			System.out.println("Total salary of the CEO is: "+ tsalary);
			break;
		
		case "MANAGER":
			tsalary = 0.16*176000 + 176000;
			System.out.println("Total salary of the MANAGER is: "+ tsalary);
			break;
		
		case "HELPER":
			tsalary = 0.09*145900 + 145900;
			System.out.println("Total salary of the MD is: "+ tsalary);
			break;
		
		default:
			System.out.println("Iinvalid post.");
			break;
		}
		
		
	}

}
