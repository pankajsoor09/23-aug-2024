package java8features;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {

		FunctionalInterfaceDemo.print();
		FunctionalInterfaceDemo.display(100);
		
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo() { // Anonymous // will create a . class file $1 $2 
			
			@Override
			public void show() {
				System.out.println("show() in FunctionalInterfaceTest");

			}
		};
		
		demo.display();
		demo.display("Hello");
		demo.show();
		
	}

}
