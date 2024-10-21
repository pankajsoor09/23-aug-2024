package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable<String,Float> map1 = new Hashtable<>();
		map1.put("Hello", 45.6f);
		map1.put("Hi", 45.6f);
		map1.put("welcome", 45.6f);
		map1.put("Hashtable", 56.7f);
		map1.put("Bye", 35.8f);
		map1.put("collection", 95.6f);
		map1.put("Hello", 55.5f);
	//	map1.put(null, 55.5f);//null pointer exception // null is not allowed in hashtable
	//	map1.put("Hello", null);//null pointer exception // null is not allowed in hashtable
		Set<String> keys = map1.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map1.get(key));
		}
		
	}

}
