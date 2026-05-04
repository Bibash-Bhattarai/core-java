package arrays;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		int num[]= new int[50];
		
		int index = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%2 == 0) {
				num[index]=i;
				index ++;
			}
			
		}
		System.out.println("Even Number from 0 to 100 are: ");
		for(int x : num) {
			System.out.print(x+" ");
		}
	}

}
