package arrayofobject;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// store and print data of 10 products
		
		// create array
		
		Product prods[] = new Product[5];
		
		// write data in array
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<prods.length; i++) {
			
			Product p = new Product();
			
			System.out.println("Enter Id:");
			p.setId(sc.nextInt());
			
			System.out.println("Enter Name:");
			p.setName(sc.next());
			
			System.out.println("Enter price:");
			p.setPrice(sc.nextInt());
			
			System.out.println("Enter Company:");
			p.setCompany(sc.next());
			
			prods[i] = p;
		}
		
		// read data from array
		
		
		int tp = 0;
		for(Product p: prods) {
			
			System.out.println(p);
			
			if(p.getCompany().equals("dell")) {
			
				tp = tp + p.getPrice();
			
		}
		
		System.out.println("Total price of dell product: " + tp);
		}
	}
}
