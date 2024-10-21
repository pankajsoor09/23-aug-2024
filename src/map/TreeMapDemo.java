package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, Double> map1 = new TreeMap<>();
		map1.put(10, 10.5);
		map1.put(40, 40.5);
		map1.put(20, 20.5);
		map1.put(50, 50.5);
		map1.put(30, 10.5);
		map1.put(60, 10.5);
		map1.put(10, 55.5);
		map1.put(70, null);// null can be value but not key
	//	map1.put(null, 10.5);//In TreeMap null key is not allowed but null values are allowed

		
		System.out.println(map1);
		
		System.out.println("-------------------------------------");
		
		TreeMap<String, Integer> map2 = new TreeMap<>();
		map2.put("Hello", 10);
		map2.put("Hi", 10);
		map2.put("welcome", 10);
		map2.put("TreeMap", 100);
		map2.put("Hey", 20);
		map2.put("bye", 30);
		map2.put("Hello", 50);
		
		System.out.println(map2);
		
		System.out.println("-------------------------------------");
		
		TreeMap<Student,String> map3 = new TreeMap<>();
		map3.put(new Student(111,"Pankaj",98.9f), "Distinction");
		map3.put(new Student(115,"Rahul",78.9f), "1st class");
		map3.put(new Student(113,"Atul",58.9f), "3rd class");
		map3.put(new Student(112,"Raj",95.9f), "Distinction");
		map3.put(new Student(114,"Neha",45.9f), "Pass");
		map3.put(new Student(116,"Sumit",45.9f), "Pass");
		map3.put(new Student(113,"Atul",58.9f), "2nd class");//will replace old value with new one
		
		Set<Student> keySet = map3.keySet();
		Iterator<Student> it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s+" :: "+map3.get(s));
		}
		
System.out.println("-------------------------------------");
		
		TreeMap<Student,String> map4 = new TreeMap<>(new StudentComparator());
		map4.put(new Student(111,"Pankaj",98.9f), "Distinction");
		map4.put(new Student(115,"Rahul",78.9f), "1st class");
		map4.put(new Student(113,"Atul",58.9f), "3rd class");
		map4.put(new Student(112,"Raj",95.9f), "Distinction");
		map4.put(new Student(114,"Neha",45.9f), "Pass");
		map4.put(new Student(116,"Sumit",45.9f), "Pass");
		map4.put(new Student(113,"Atul",58.9f), "2nd class");//will replace old value with new one
		
		 keySet = map4.keySet();
		 it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s+" :: "+map4.get(s));
		}

		
	}

}
