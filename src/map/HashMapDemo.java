package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();// java 7 diamond//we used generic
		map1.put(10, "Hello");
		map1.put(20, "Hello");
		map1.put(30, "Hello");
		map1.put(40, "Hi");
		map1.put(50, "Welcome");
		map1.put(60, "bye");
		map1.put(null, "bye");
		map1.put(70, null);//null is allowed
		map1.put(10, "HashMap");// hashmap will replace hello as they have same key 10

		// to get set of keys: keyset()
		Set<Integer> keys = map1.keySet();

		Iterator<Integer> it1 = keys.iterator();
		while (it1.hasNext()) {
			Integer key = it1.next();
			System.out.println(key + " : " + map1.get(key));

			// map1.get(key);
		}
		System.out.println("-----------------------------------------------");

		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("Hello", 10);
		map2.put("Hi", 10);
		map2.put("welcome", 10);
		map2.put("HashMap", 100);
		map2.put("Hey", 20);
		map2.put("bye", 30);
		map2.put("Hello", 50);

		Set<String> keySet = map2.keySet();
		Iterator<String> it2 = keySet.iterator();
		while (it2.hasNext()) {
			String key = it2.next();
			System.out.println(key + " : " + map2.get(key));
		}
		System.out.println("-----------------------------------------------");
		HashMap<Employee, String> map3 = new HashMap<>();
		map3.put(new Employee(111, "Raj", 1200000), "Trainer");
		map3.put(new Employee(112, "Suraj", 200000), "Manager");
		map3.put(new Employee(113, "Pankaj", 500000), "Genneral Manager");
		map3.put(new Employee(114, "Akash", 700000), "Team Lead");
		map3.put(new Employee(115, "Aarya", 800000), "Manager");
		map3.put(new Employee(113, "Pankaj", 500000), "Branch Manager");

		Set<Employee> keyvalue = map3.keySet();
		Iterator<Employee> it3 = keyvalue.iterator();
		while (it3.hasNext()) {
			Employee key = it3.next();
			System.out.println(key + " : " + map3.get(key));
		}

	}

}
