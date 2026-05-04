package arrays;

import java.util.Scanner;

public class CityName {

	public static void main(String[] args) {
		
		String city[] = new String[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<city.length; i++) {
			
			System.out.println("enter the name of city: ");
			city[i] = sc.next();
		}
		
		System.out.println("The name of cities are : ");
		for(String x : city) {
			System.out.println(x);
		}
	}
}
