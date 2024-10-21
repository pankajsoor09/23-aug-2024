package innerclass;

public class NestedClassDemo {
	
	private int number ;//non static 
	private static String msg;
	
	static class NestedClass{
		void setData (String msg) {
			NestedClassDemo.msg = msg;
			// number = 100; // number is non-static ,can't be accessed in static class
		}
		void show() {
			System.out.println("Message is : "+msg);
		}
		
	}
	

}
