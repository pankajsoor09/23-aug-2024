package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayListStudent {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Raj", 85));
		list.add(new Student("Suraj", 75));
		list.add(new Student("Pankaj", 65));
		list.add(new Student("Ramesh", 55));
		list.add(new Student("Aditya", 87));
		// list.add(new Student ("Raj",85));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------------------------");
//in tree set demo refer comments
		Collections.sort(list, new StudentComparator()); // sort(List<T> list)//sort() of collection class

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		// TreeSet<Student> set = new TreeSet<>();
	}

//	ArrayList<Student> list = new ArrayList<>();
//	list.add(new Student ("Raj",85));

}
