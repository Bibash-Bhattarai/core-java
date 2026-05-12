package matrix;

import java.util.Scanner;

public class MatrixDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows of first matrix:");
		int r1 = sc.nextInt();
		
		System.out.println("Enter the columns of first matrix:");
		int c1 = sc.nextInt();
		
		Matrix m1 = new Matrix(r1,c1);
		
		System.out.println("Elements os first matrix:");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				m1.setElement(i, j, sc.nextInt());
			}
		}
		
		System.out.println("Enter the rows of second matrix:");
		int r2 = sc.nextInt();
		
		System.out.println("Enter the columns of second matrix:");
		int c2 = sc.nextInt();
		
		Matrix m2 = new Matrix(r2,c2);
		
		System.out.println("Elements os second matrix:");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				m2.setElement(i, j, sc.nextInt());
			}
		}
		
		Matrix sum = m1.add(m2);
		
		if(sum != null) {
			System.out.println("Added matrix is:");
			sum.display();
		}
		
		Matrix product = m1.multi(m2);
		
		if(product != null) {
			System.out.println("The product of matrix is:");
			product.display();
		}

	}
}
