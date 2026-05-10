package constructor;

import java.util.Scanner;

public class Matrix {

	int rows;
	int cols;
	int[][] a;
	
	
	Matrix(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
		a= new int[rows][cols];
		inputMatrix();
		displayMatrix();
	}
	
	void inputMatrix() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< rows ; i++) {
			for(int j = 0; j< cols ; j ++) {
				System.out.println("Enter elements of a["+i+"]["+j+"] :");
				a[i][j]= sc.nextInt();
			}
		}
	}
	
	void displayMatrix() {
		
		System.out.println("The matrix is: ");
		for(int i = 0; i< rows; i++) {
			for(int j = 0; j< cols; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter the no of columns:");
		int cols = sc.nextInt();
		
		Matrix m =new Matrix(rows,cols);
	}
}
