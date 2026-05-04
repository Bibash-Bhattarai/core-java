package datatype;

public class DataType {
	/*
	 * ---------Data Type---
	 * #proper data representation
	 * #proper memory allocation
	 * #proper operation to perform
	 * 
	 * ------- 1.Primitive Data type
	 * 				a. byte: 1 byte(8 bit) : -128 to 127
	 * 				b. short : 2 byte (16 bit) : -32768 to 32767
	 * 				c. int : 4 byte : -2^31 to 2^31-1
	 * 				d. long : 8 byte : -2^63 to 2^63-1 :(l)
	 * 				e. float : 8 byte : 6-7 digit precision 
	 * 				f. double : 8 byte : 15 digit precision 
	 * 				g. char: 2 byte : 0 to 65535
	 * 				h. boolean : 1 byte 
	 * 
	 * ------- 2. Non-Premitive:
	 * 				a. string : sequence of character
	 * 				b. Array : collection of elements of same data type
	 * 				c. Class : blueprint for creating object
	 * 				d. Interface : blueprint for creating classes
	 * 				e. Enum : special data type that enables for a variable to be a set
	 */
	
	public static void main(String[] args) {
		
		long a = 50000000000l;
		float p = 1.5f;
		
		System.out.println("byte : "+ Byte.SIZE +" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("short : "+Short.SIZE+" "+Short.MIN_VALUE+" "+ Short.MAX_VALUE);
		System.out.println("int : "+ Integer.SIZE +" "+ Integer.MIN_VALUE +" "+ Integer.MAX_VALUE);
		System.out.println("long : "+Short.SIZE+" "+Short.MIN_VALUE+" "+ Short.MAX_VALUE);
		System.out.println("float : "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
		System.out.println("double :"+ Double.SIZE+" "+Double.MIN_VALUE+" "+ Double.MAX_VALUE);
		
	}
	
}
