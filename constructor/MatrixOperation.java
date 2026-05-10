package constructor;

import java.util.Scanner;

public class MatrixOperation {

	int rows;
	int cols;
	int[][] matrix;
	
	MatrixOperation(int rows, int cols){
		
		this.rows = rows;
		this.cols = cols;
		
		matrix = new int[rows][cols];
		
		getElement();
	}
	
	void getElement() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i< rows; i++ ) {
			for(int j = 0; j<cols; j++) {
				System.out.println("Enter elements of a["+i+"]["+j+"] :");
				matrix[i][j]= sc.nextInt();
			}
		}
	}
	void displayMatrix() {
		
		for(int i=0; i< rows; i++ ) {
			for(int j = 0; j<cols; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	void add(MatrixOperation m) {
		
		if(this.rows == m.rows && this.cols == m.cols) {
			for(int i=0; i< rows; i++ ) {
				for(int j = 0; j<cols; j++) {
					
					matrix[i][j]+= m.matrix[i][j];
				}
			}
		}
		else {
			System.out.println("Matrix cannot be added.");
		}
			
		displayMatrix();
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no. of rows of first matrix: ");
		int r1 = sc.nextInt();
		
		System.out.println("Enter the no. of columns of first matrix: ");
		int c1 = sc.nextInt();
		
		System.out.println("Enter the no. of rows of Second matrix: ");
		int r2 = sc.nextInt();
		
		System.out.println("Enter the no. of columns of Second matrix: ");
		int c2 = sc.nextInt();
		
		MatrixOperation mo1 = new MatrixOperation(r1,c1);
		MatrixOperation mo2 = new MatrixOperation(r2,c2);
		
		mo1.add(mo2);
		
	}
	
}


