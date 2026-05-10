package constructor;

public class TriangleWithPara {

	
	TriangleWithPara(int p , int b, int h){
		int area =  ( p * b)/2;
		int per = p + b + h;
		System.out.println("Area of triangle is : "+ area);
		System.out.println("Perimiter of triangle is: "+ per);

	}
	
	public static void main(String[] args) {
	
		TriangleWithPara t = new TriangleWithPara(3,4,5);
	}
}
