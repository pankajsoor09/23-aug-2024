package collection;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {

		LinkedList list2 = new LinkedList();
		
		list2.add(new Integer(10));
		list2.add(27);//autoboxing
		
		list2.add(new Float(18.9));
		list2.add(44.56);
		list2.add(new String ("Soor"));
		list2.add("Zoro");
		list2.add(1, "soor pankaj");
		//store duplicate
		list2.add(new String ("Soor"));
		list2.add("Zoro");
		list2.add(1, "soor pankaj");
		list2.add(new Employee (11,"raju",13456.54f));
		list2.add(new Employee (12,"yuji",32456.54f));
		list2.add(new Employee (13,"Gojo",34576.54f));
		list2.add(new Employee (14,"Aditya",3457876.54f));
		list2.add(new Employee (13,"Gojo",34576.54f));
		list2.add(new Employee (14,"Aditya",3457876.54f));
		
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("List index Soor : "+list2.indexOf("Soor"));
		System.out.println("List index Zoroto : "+list2.indexOf("Zoroto"));
		
		System.out.println("List contains 10 : "+list2.contains(10));
		System.out.println("List contains soor pankaj : "+list2.contains("soor pankaj"));
		
		System.out.println("last index of Soor : "+list2.lastIndexOf("Soor"));
		
		System.out.println("Remove Soor object : "+list2.remove("Soor"));
		
		System.out.println("Remove object at 3rd index  : "+list2.remove(3) );
		
		System.out.println("Remove Integer object 22 : "+list2.remove(new Integer(22)));
		
		
		
	}

}
