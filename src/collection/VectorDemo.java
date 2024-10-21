package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(10);//vector specific method//auto boxing it will create wrapper Integer object
		vector.addElement(20);//addElement to achieve thread safety
		vector.addElement(30);
		vector.addElement(40);
		vector.addElement(50);
		vector.addElement(60);
		vector.addElement(70);
		vector.addElement(80);
		vector.addElement(90);
		vector.addElement(20);
		vector.addElement(30);
		vector.addElement(40);

		//elements () in Vector class to get Enumeration object 
		Enumeration<Integer> em = vector.elements();
		
		//hasMoreElements()from Enumeration interface to check weather there is more elements 
		//to iterate from Vector or not 
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());//nextElement() from Enumeration interface to 
			                                     // actually get object  from Vector
		}
	}

}
