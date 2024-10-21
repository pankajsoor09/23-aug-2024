package java5features;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 60 };
		System.out.println("Integer Array Elements : ");
		for (int number : numbers) {
			System.out.println(number);
		}
		System.out.println("--------------------------------");
		String[] strings = { "hello", "Hi", "NO" };
		System.out.println("Stirng Array Elements : ");
		for (String str : strings) {
			System.out.println(str);
		}
		System.out.println("--------------------------------");

		List<String> stringList = Arrays.asList("List", "Hi", "Welcome", "asList");
		System.out.println("List Elements");
		for (String str1 : stringList) {
			System.out.println(str1);
		}
		System.out.println("--------------------------------");

		List<Double> numList = Arrays.asList(10.5, 30.6, 55.7, 55.56);
		System.out.println("Number List Elements");
		for (Double number : numList) {
			System.out.println(number);

		}
		System.out.println("--------------------------------");

		List<Employee> employeeList = Arrays.asList(new Employee(111, "Pankaj", 1230000),
				                                        new Employee(112, "Raj", 230000), 
				                                        new Employee(113, "Akash", 130000),
				                                        new Employee(114, "Suraj", 120000));
		System.out.println("Employee List Elements");
		for (Employee emp : employeeList) {
			System.out.println(emp);

		}

	}
}
