package methods;

import java.util.Scanner;

public class MethodTest {
	
	// 1. no return type with no arguments
	
	public static void main(String[] args) {
		
		sum();
		printTable(4);
		int sv = getSmallest(56,43);
		
		System.out.println("Smallest value : "+ sv);
		
		System.out.println("Sum of 1 to 100 is : "+ getSumOf1To100());
		
		
		
	}
	static void sum() {
		int a = 23;
		int b = 67;
		
		int c = a + b;
		
		System.out.println("Sum = "+ c);
	}
	
	// 2. no return type with arguments
	
	static void printTable(int n) {
		
		
		for(int i=1; i<=10 ; i++) {
			
			System.out.println(n+" * "+i+" = "+(n*i));
		}
				
	}
	
	
	// 3. return type with arguments
	
	
	static int getSmallest(int x , int y) {
		
		if( x < y)
			return x;
		else
			return y;
	}

	
	// 4. return type with no arguments
	
	static int getSumOf1To100() {
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			
		  sum +=i;
			
		}
		return sum;
	}
}
