package methods;

public class AreaVolume {
	
	public static void main(String[] args) {
		
		int a = area(5,4);
		System.out.println("Area is : "+ a);
		
		volume(a,3);
		
	}
	
	static int area(int l, int b) {
		
		return (l*b);
		
	}
	
	static void volume(int a, int h) {
		
		System.out.println("Area is : "+ a);
		int v = a * h ;
		
		System.out.println("Volume is : "+ v);
	}

}
