package abstraction;

public class AbstractionDocs {

	/*
	 * ----------- Abstraction -----------------
	 * 
	 * # process of hiding implementation details.
	 * # to achieve abstraction:
	 * 
	 * 		1. Abstract class:
	 * 				# class which contains abstract methods and non-abstract methods.
	 * 				# Abstract methods:
	 * 						-> method which does not have body or implementation.
	 * 						-> syntax:
	 * 
	 * 								abstract return_type method_name(arg1, arg2, ......, argn);
	 * 								 e.g
	 * 									abstract void print();
	 * 									abstract int getArea(int l, int b);
	 * 
	 * 			# every abstract class must have at least one child class and child class must override abstract methods.
	 * 			# level of abstraction 0-100%.
	 * 			# we can't create object of abstract.
	 * 			# Syntax:
	 * 
	 * 				abstract class class-name{
	 * 
	 * 						// abstract methods
	 * 						// non-abstract methods
	 * 				}
	 * 
	 * 		2. Interface:
	 * 
	 * 			# same as class which contains public abstract methods and public static final methods only.
	 * 
	 * 			# every interface must have at least one implementation class and implementation class must override abstract methods.
	 * 
	 * 			# 100% abstraction 
	 * 			# can't create object
	 * 			# we can inherit multiple interfaces at a time.
	 * 
	 * 		# Syntax:
	 * 
	 * 				interface interface_name{
	 * 
	 * 					// public abstract methods
	 * 
	 * 					// public static final(constants)
	 * 
	 * 				}
	 */									
}
