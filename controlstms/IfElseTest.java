package controlstms;

import java.util.Scanner;

public class IfElseTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ehter the number to check even or odd: ");
		int n =  sc.nextInt();
		
		if(n % 2 == 0){
			System.out.println(n + " is even number.");
			
		}
		else {
				System.out.println(n +" is odd number.");
		}
	}

}
