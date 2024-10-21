package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {// no index in set so there is no get method ..it has Iterator <I> : java.util but
	                        // also Iterator <I>  can be used in any collection but it is not thread safe by Iterator <I> 
	                        // we can use remove method to remove elemnts

	public static void main(String[] args) {
        //Creating Hashset of type Integer
		HashSet<Integer> set1 = new HashSet<Integer>();
		//adding Integer object in set
		set1.add(10);//Auto Boxing : it will create Integer wrapper object
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(10);// set will not hold it it is duplicate 
		set1.add(10);
		//use iterator() method of HashSet to get object of Iterator
		Iterator<Integer> it = set1.iterator();
		
		System.out.println("1st HashSet Elements : ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
       System.out.println("-----------------------------");
       HashSet<String> set2 = new HashSet<String>();
       set2.add("Hello");
       set2.add("Hi");
       set2.add("welcome");
       set2.add("HashSet");
       set2.add("collection");
       set2.add("Hello");
       set2.add("Hello");
       set2.add("Soor");
       
       System.out.println("String HashSet : ");
       
       Iterator<String> it2 = set2.iterator();
       while(it2.hasNext())
       {
    	   System.out.println(it2.next());
       }
       System.out.println("----------------------------------");
       HashSet<Student> set3 = new HashSet<Student>();
       set3.add(new Student (11,"Suraj",95.5f));
       set3.add(new Student (12,"Raj",45.5f));
       set3.add(new Student (13,"Amar",47.5f));
       set3.add(new Student (14,"Ridhi",94.5f));
       set3.add(new Student (15,"Neha",90.5f));
       set3.add(new Student (11,"Suraj",95.5f));
       set3.add(new Student (12,"Raj",45.5f));
       set3.add(new Student (13,"Amit",47.5f));
       //need to override hashCode because if the hashcode is different then it will treat as a different object 
       // so after overriding equal method then need to over ride hash code and make roll no as hashcode so if every thing is 
       // equal then it will not return duplicate object
       Iterator<Student> it3 = set3.iterator();
       System.out.println("Student HashSet");
        while(it3.hasNext()) {
        	System.out.println(it3.next());
        }
	}

}
