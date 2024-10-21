package java8features;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<Integer, String> obj1 = num -> num%2==0?num+" is Even Number":num+" is odd Number";
		System.out.println(obj1.apply(24));
		
		Function<Integer , Integer> obj2 = num -> num*num*num;
		System.out.println("Cube of 5 is "+obj2.apply(5));
		System.out.println("Cube of 9 is "+obj2.apply(9));
		
	}

}
