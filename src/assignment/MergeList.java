package assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeList {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(new Integer(10) );
		list1.add(new Integer(20) );
		list1.add(new Integer(30) );
		list1.add(new Integer(40) );
		list1.add(new Integer(50) );
		

		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
			}
System.out.println("________________________________________________________");
		ArrayList list2 = new ArrayList();
		list2.add(new Integer(10));
		list2.add(new Integer(20));
		list2.add(new Integer(60));
		list2.add(new Integer(70));
		list2.add(new Integer(80));

		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i));
			}
		System.out.println("________________________________________________________");

		list1.addAll(list2);
		
        HashSet set = new HashSet(list1);//convert list to set 
        
        ArrayList list3 =new  ArrayList(set);// convert set to list
        for(int i=0; i<list3.size();i++) {
			System.out.println(list3.get(i));
			}

	}

}
