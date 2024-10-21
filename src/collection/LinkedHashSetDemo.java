package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		
		Iterator<Integer> i1 = s1.iterator();
		
		System.out.println("1st LinkedHashSet Elemnts : ");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("------------------------");
		
		LinkedHashSet<String> s2 = new LinkedHashSet<String>();
		s2.add("Soor");
		s2.add("Pankaj");
		s2.add("Raj");
		s2.add("Nayan");
		s2.add("Adi");
		s2.add("Soor");
		s2.add("Raj");
		s2.add("Soor");
		
		System.out.println("Stirng LinkedHashSet elemnts : ");
		
		Iterator<String> i2 = s2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println("----------------------");
		LinkedHashSet<Student> s3 = new LinkedHashSet<Student>();
		 s3.add(new Student (11,"Suraj",95.5f));
	       s3.add(new Student (12,"Raj",45.5f));
	       s3.add(new Student (13,"Amar",47.5f));
	       s3.add(new Student (14,"Ridhi",94.5f));
	       s3.add(new Student (15,"Neha",90.5f));
	       s3.add(new Student (11,"Suraj",95.5f));
	       s3.add(new Student (12,"Raj",45.5f));
	       s3.add(new Student (13,"Amit",47.5f));
	       
	       Iterator<Student> i3 = s3.iterator();
	       System.out.println("Student LinkedHashSet");
	       while(i3.hasNext()) {
	    	   System.out.println(i3.next());
	       }
		
	}

}
