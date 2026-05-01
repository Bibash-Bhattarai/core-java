package looping;

public class ForEachLoop {

	public static void main(String[] args) {
	
		int sum = 0;
	int data[] = {10, 20 , 30 , 40 ,50 };
	for(int x: data) {
		System.out.println(x);
		sum +=x;
	}
	System.out.println("Sum = "+ sum);
	}
}
