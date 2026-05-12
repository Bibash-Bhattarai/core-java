package matrix;

public class Matrix {
	
	int rows,cols;
	int[][] mat;
	
	Matrix(int r, int c){
		
		rows = r ;
		cols = c;
		mat = new int[rows][cols];
	}
	
	int getRows() {
			return rows;
	}
	
	int getCols() {
		return cols;
	}
	
	void setElement(int i, int j, int value) {
		mat[i][j]= value;
	}
	
	Matrix add(Matrix m) {
		
		if(rows!= m.rows || cols != m.cols) {
			System.out.println("Matrix cannot be added.");
			return null;
		}
		
		Matrix result = new Matrix(rows,cols);
		
		for (int i=0; i<rows;i++) {
			for(int j=0; j< cols; j++) {
				result.mat[i][j]= mat[i][j] + m.mat[i][j];
			}
		}
		return result;
	}
	
	Matrix multi(Matrix m) {
		
		if(cols != m.rows) {
			System.out.println("Matrix cannot be multiplied.");
			return null;
		}
		
		Matrix result= new Matrix(rows, m.cols);
		
		for(int i=0; i< rows; i++) {
			for(int j=0; j< m.cols; j++) {
				for(int k = 0; k<cols; k++) {
					result.mat[i][j] += mat[i][k] * m.mat[k][j]; 
				}
			}
		}
		return result;
	}
	
	void display() {
		
		for(int i=0; i<rows;i++) {
			for(int j =0; j< cols; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
