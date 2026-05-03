package methods;

import java.util.Scanner;

public class SIAmount {

	public static void main(String[] args) {
		
		siAmount();
	}
	
	static void siAmount(){
		
		int p, t, r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle : ");
		p = sc.nextInt();
		
		System.out.println("Enter time : ");
		t = sc.nextInt();
		
		System.out.println("Enter rate : ");
		r = sc.nextInt();
		
		int si = (p * t * r)/100;
		
		int amount = si + p;
		
		System.out.println("Simple Interest is : "+ si);
		System.out.println("Amount is : "+ amount);
		
	}
}
