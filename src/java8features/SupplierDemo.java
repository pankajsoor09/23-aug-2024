package java8features;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> obj1  = () -> "This is supplier Demo";
		System.out.println(obj1.get());
		
	}

}
