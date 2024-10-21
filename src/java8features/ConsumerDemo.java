package java8features;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> obj1 = num -> {// consumer will not return any thing it consumes
			if(num%2==0) {
				System.out.println(num+" is Even Number");
			}
			else {
				System.out.println(num+"is odd Number");
			}
		};
            obj1.accept(24);
            
            Consumer<String> obj2 = str -> {
            	if(str.startsWith("H")) {
            		System.out.println(str+" is starting with H");
            	}else {
            		System.out.println(str+"is Not starting with H");
            	}
            };
            
            obj2.accept("hi");
	}

}
