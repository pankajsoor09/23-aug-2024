package collection;

import java.util.ArrayList;

public class ArrayListDemo {//list

	public static void main(String[] args) {
		//creating ArrayList object
		ArrayList list1 = new ArrayList();
		
		list1.add(new Integer(10));
		list1.add(20); // AutoBoxing // object will be created and object will be added to list
		//here it will internally create new  Integer wrapper object 
		list1.add(new Float(25.5));
		list1.add(56.5);//AutoBoxing // here it will internally create new Double wrapper object
		list1.add(new String ("Hello"));
		list1.add("Hi");
		list1.add(2, "welcome");
		//list store duplicate value
		list1.add(new Float(25.5));
		list1.add(56.5);//AutoBoxing // here it will internally create new Double wrapper object
		list1.add(new String ("Hello"));
		list1.add(new Employee(111,"Pankaj",2500000.50f));
		list1.add(new Employee(112,"Raj",200000.50f));
		list1.add(new Employee(113,"Soor",500000.50f));
		list1.add(new Employee(114,"Nana",20000.50f));
		list1.add(new Employee(111,"Pankaj",2500000.50f));
		list1.add(new Employee(112,"Raj",200000.50f));
 		list1.add(new Employee(113,"Soor",500000.50f));

		
		for(int i=0; i<list1.size();i++) {//array has array.length same list has size
			System.out.println(list1.get(i));// to get the elements from list : get(int) method we can use 
			                                 // get () will accept index and return object at that index
			
		}
		//to check list contains particular object or not
		System.out.println("List contains Hello : "+list1.contains("Hello"));
		System.out.println("List contains 50 : "+list1.contains(50));
		
		//To check what is index of particular object in list
		System.out.println("Index of Hello : "+list1.indexOf("Hello"));
		System.out.println("Index of  50 : "+list1.indexOf(50));// returns -1 if obj is not in the list

		
		//to check what is last index of particular object in list
		System.out.println("Last Index of Hello : "+list1.lastIndexOf("Hello"));
		
		//to remove object at particular index in List
		System.out.println("Remove object at 4th index : "+list1.remove(4));
		
		//to remove object from List
		System.out.println("Remove Hello object : "+list1.remove("Hello"));
		System.out.println("Remove Integer object 50  : "+list1.remove(new Integer(50)));
		
		ArrayList<String> stringList = new ArrayList<String>();//used generic to create type -safe  list
		stringList.add("Soor");
		//strinList.add(10); // error as it List of type String we can add only String objects 
		stringList.add("hi");
		stringList.add("welcome");
		stringList.add("ArrayList");
		stringList.add("Collection");
		stringList.add("hi");
		stringList.add("welcome");
		stringList.add("hi");
		
		System.out.println("----------------------------------------------");
		System.out.println("String List : ");
		for(int i = 0 ; i<stringList.size();i++) {
			System.out.println(stringList.get(i));
		}
	}

}
