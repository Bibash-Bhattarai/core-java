package controlstms;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op1,op2;
		char orp;
		
		System.out.println("Enter two number: ");
		op1 = sc.nextInt();
		op2 = sc.nextInt();
		
		System.out.println("Enter the Operation Symbol you want to perform: ");
		orp = sc.next().charAt(0);
		
		switch(orp) {
		
		case '+':
			int sum= op1+op2;
			System.out.println("The sum of "+ op1 + " and "+ op2 +" is: " + sum);
			break;
		case '-':
			int diff= op1-op2;
			System.out.println("The difference of "+ op1 + " and "+ op2 +" is: " + diff);
			break;
		case '*':
			int mul= op1*op2;
			System.out.println("The multiplication of "+ op1 +" and "+ op2 +" is: " + mul);
			break;
		case '/':
			int div= op1/op2;
			System.out.println("The division of "+ op1 +" by "+ op2 +" is: " + div);
			break;
		default:
			System.out.println("Invalid operator.");
			break;
		}
	}
}
