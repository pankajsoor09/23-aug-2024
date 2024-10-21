package java8features;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> obj1 = num -> {
			if (num % 2 == 0)
				return true;
			else
				return false;
		};
		int num = 20;
		boolean status = obj1.test(num);
		if (status) {
			System.out.println(num + "is Even Number");
		} else {
			System.out.println(num + "is odd Number");
		}

		Predicate<Integer> obj2 = num1 -> num % 2 == 0 ? true : false;
		int num1 = 23;
		status = obj2.test(num1);
		if (status) {
			System.out.println(num1 + "is Even Number");
		} else {
			System.out.println(num1 + "is odd Number");
		}
		Predicate<String> obj3 = str -> str.startsWith("H") ? true : false;
		String msg = "Hello";
		status = obj3.test(msg);
		if (status) {
			System.out.println(msg + " is starting with H");
		} else {
			System.out.println(msg + "is Not starting with H");
		}
	};
}
