package constructor;

public class Triangle {

	int p = 3;
	int b = 4;
	int h = 5;
	
	Triangle(){
		int area =  ( p * b)/2;
		int per = p + b + h;
		System.out.println("Area of triangle is : "+ area);
		System.out.println("Perimiter of triangle is: "+ per);
	}
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
	}
}
