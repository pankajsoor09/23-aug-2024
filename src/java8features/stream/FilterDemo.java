package java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 20, 23, 24, 25, 29, 31, 30, 19, 35);

		System.out.println("List of all number : ");
		System.out.println(list1);
		
        // on string filter and in collect collectors to convert string to list
		
		List<Integer> evenList = list1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		
		System.out.println("List of Even Number");
		System.out.println(evenList);
		
		System.out.println("-------------------------------------------------------------------");
		
		List<String> list2 = Arrays.asList("Hello","Stream","Collection","Hi","Welcome","Hey","Java8");
		
		System.out.println("List of all String");
		System.out.println(list2);

		List<String> stringList = list2.stream().filter(str -> str.startsWith("H")).collect(Collectors.toList());
		System.out.println("List of string Starting with H : ");
		System.out.println(stringList);
		
		System.out.println("-------------------------------------------------------------------");
		
		List<Employee> list3 = Arrays.asList(new Employee(101,"Pankaj",120098.00f),
				                            new Employee(102,"Raj",130098.00f),
				                            new Employee(103,"Suraj",450098.00f),
				                            new Employee(121,"Soor",20098.00f));
		
		System.out.println("List of All Employees : ");
		for(Employee e : list3) {
			System.out.println(e);
		}
		
		List<Employee> empList = list3.stream().filter(emp -> emp.getSalary() > 10000).collect(Collectors.toList());
          System.out.println("List of Employees with salary > 10000 ");
          for(Employee e : empList) {
        	  System.out.println(e);
          }
          
  		System.out.println("-------------------------------------------------------------------");
               
  		List<Product> list4 = Arrays.asList(new Product(1,"Laptop",65000,"Electronics"),
  				                            new Product(2,"Book",450,"Stationary"),
  				                          new Product(3,"Mobile",75833,"Electronics"),
  				                        new Product(4,"Pen",50,"Stationary"));
  		
  		System.out.println("List of All Product : ");
  		list4.forEach(p -> System.out.println(p) );
  		
  		System.out.println("List of Product from Electronics category : ");
  		 
  		 list4.stream().filter(p -> p.getCategory().equalsIgnoreCase("Electronics") ).forEach(p-> System.out.println(p));
  		
	}

}
