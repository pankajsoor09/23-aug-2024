package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {


	public static void main(String[] args) {

		TreeSet<Integer> set1 = new TreeSet<>(); // while inserting it is sorted and compare to every entry 
		set1.add(10);
		set1.add(20);
		set1.add(50);
		set1.add(40);
		set1.add(60);
		set1.add(10);
		set1.add(30);
		set1.add(20);
		set1.add(10);
		set1.add(10);
		
		System.out.println("Integer Tree Set");
		Iterator<Integer> it1 = set1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("------------------------------------");
		
		TreeSet<String> set2 = new TreeSet<>();//diamond operator
		set2.add("Hello");//capital letter have more preference than small. so first cap will be sorted 
		set2.add("Hi");
		set2.add("bye");
		set2.add("Hello");
		set2.add("welcome");
		set2.add("Hi");
		set2.add("Soor");
		//set1.add(null);// null object is not allowed in tree set//null pointer exception
		
		System.out.println("String TreeSet");
		Iterator<String> it2 = set2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("----------------------------------");
		TreeSet<Product> set3 = new TreeSet<>(new ProductComparator());// by doing this it will know ProductComparator is created
		set3.add(new Product (111,"Mobile",150000.00,"Electronics"));
		set3.add(new Product (114,"Laptop",750000.00,"Electronics"));
		set3.add(new Product (112,"Book",50000.00,"Electronics"));
		set3.add(new Product (115,"Pen",20000.00,"Electronics"));
		set3.add(new Product (113,"Tab",450000.00,"Electronics"));
		set3.add(new Product (111,"Mobile",150000.00,"Electronics"));
		set3.add(new Product (112,"Book",50000.00,"Electronics"));
		set3.add(new Product (111,"Mobile",150000.00,"Electronics"));
		
		System.out.println("Product Tree set");// java.lang.ClassCastException: class collection.Product cannot
		Iterator<Product> it3 = set3.iterator();// be cast to class java. So product class must be comparable .use Interface
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		System.out.println("----------------------------------");
		TreeSet<Product> set4 = new TreeSet<>();
		set4.add(new Product (111,"Mobile",150000.00,"Electronics"));
		set4.add(new Product (114,"Laptop",750000.00,"Electronics"));
		set4.add(new Product (112,"Book",50000.00,"Electronics"));
		set4.add(new Product (115,"Pen",20000.00,"Electronics"));
		set4.add(new Product (113,"Tab",450000.00,"Electronics"));
		set4.add(new Product (111,"Mobile",150000.00,"Electronics"));
		set4.add(new Product (112,"Book",50000.00,"Electronics"));
		set4.add(new Product (111,"Mobile",150000.00,"Electronics"));
		
		System.out.println("Product Tree set");// java.lang.ClassCastException: class collection.Product cannot
		Iterator<Product> it4 = set4.iterator();// be cast to class java. So product class must be comparable .use Interface
		while(it4.hasNext()) {
			System.out.println(it4.next());
		}
	}

}
