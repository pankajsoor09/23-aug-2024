package java5features;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class AnnotationDemo {

	private String msg;
	private int num;		//showing unused data member warning.
	
	@Deprecated
	public AnnotationDemo() {
		System.out.println("AnnotationDemo default Constructor");
	}
	
	@Override					//it provides extra meta-data to compiler.
	public String toString() {//if s is small of string 
		// it will not full it purpose so add @override to get to know the error
		return "This is Annotation Demo Class!!";
	}
	
	
	@SuppressWarnings({ "rawtypes" , "unchecked" })
	void displayList() {
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add("Hello");
	}
	@Deprecated
	void show(String msg) {
		
		System.out.println("Show(String) in AnnotationDemo Class !!!");
		System.out.println("Message is : " + msg);
	}
	
}