package constructor;

import java.util.Scanner;

public class Complex {

	int a;
	int b;
	int c; 
	int d;
	
	Complex(int a, int b, int c,int d){
	
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		
		sum();
		diff();
		mul();
		
	}
	
	void sum() {
		
		System.out.println("The sum is: "+ (a+c)+" + "+(b+d)+"i");
	}
	
	void diff() {
		
		System.out.println("The difference is: "+(a-c)+" + "+(b-d)+"i");
	}
	
	void mul() {
		System.out.println("The product is: "+(a*c - b*d)+" + "+(a*d + b*c)+"i");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the real part of 1st complex number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the imaginary part of 1st complex number:");
		int b = sc.nextInt();
		
		System.out.println("Enter the real part of 2nd complex number:");
		int c = sc.nextInt();
		
		System.out.println("Enter the imaginary part of 2nd complex number:");
		int d = sc.nextInt();
		
		Complex cpx = new Complex(a,b,c,d);

	}
}
