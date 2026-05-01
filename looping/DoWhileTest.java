package looping;

public class DoWhileTest {
	
	public static void main(String[] args) {
		
		int i =1;
		int n = 9;
		do {
			System.out.println(n + " * "+ i+" = "+ i*n);
			i++;
		}while(i <= 10);
	}

}
