package controlstms;

import java.util.Scanner;

public class IfTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt();
		
		
		if(salary < 50000)
			{
			salary = salary + 5000;
			}
		System.out.println("Total salary: "+ salary);
	}

}
