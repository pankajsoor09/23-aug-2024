package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lmap1 = new LinkedHashMap<>();
		lmap1.put(10,"Hello" );
		lmap1.put(20, "Soor");
		lmap1.put(40, "Super");
		lmap1.put(30, "Raj");
		lmap1.put(50, "Toshiro");
		lmap1.put(10, "Hello");
		lmap1.put(null, "Hello");
		lmap1.put(null, "Hello");
		lmap1.put(null, "Hi");//null hi will be printed // it will replace the previous key
		lmap1.put(70,null);// there can be multiple null value // value can be duplicate
		lmap1.put(80,null);
		
		System.out.println(lmap1);
		
		System.out.println("------------------------------------------");
		
	
		Set<Integer> keys = lmap1.keySet();
		
		Iterator<Integer> it1 = keys.iterator();
		while(it1.hasNext()) {
			Integer key = it1.next();
			//System.out.println(key );
			System.out.println(key+" : "+lmap1.get(key));
		}
		System.out.println("------------------------------------------");

		LinkedHashMap<String,Integer> lmap2 = new LinkedHashMap<>();
		lmap2.put("Hi", 10);
		lmap2.put(null, 10);
		lmap2.put("Hi", null);
		lmap2.put("Soor", 20);
		lmap2.put("bye", 30);
		lmap2.put(null, 40);
		lmap2.put("No", null);
		//lmap2.put("Hi", 10);

		 Set<String> keyset = lmap2.keySet();
		 Iterator<String> it2 = keyset.iterator();
		 while(it2.hasNext()) {
			 String key = it2.next();
			 System.out.println(key+" : "+lmap2.get(key));
			 }
		 
			System.out.println("------------------------------------------");
			
			LinkedHashMap<Employee,String> lmap3 = new LinkedHashMap<>();
			lmap3.put(new Employee(111, "Pankaj",1500000),"java");
			lmap3.put(new Employee(12, "Suraj", 200000), "Manager");
			lmap3.put(new Employee(113, "Pankaj", 500000), "Genneral Manager");
			lmap3.put(new Employee(114, "Akash", 700000), "Team Lead");
			lmap3.put(new Employee(115, "Aarya", 800000), "Manager");
			lmap3.put(new Employee(113, "Pankaj", 5009000), "Branch Manager");
			
			System.out.println(lmap3);
			System.out.println("------------------------------------------");
			
			Set<Employee> keyvalue = lmap3.keySet();
			Iterator<Employee> it3 = keyvalue.iterator();
			while(it3.hasNext()) {
				Employee key = it3.next();
				System.out.println(key+" : "+lmap3.get(key));
			}

			

	}

}
