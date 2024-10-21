package innerclass;

public class AnnonymousInnerClassDemo {

	public static void main(String[] args) {

		MyInterface obj1 = new MyInterface() {
			public void show() {
				System.out.println("show() in AnnonymousInnerClassDemo");

			}

			public void display(String msg) {
				System.out.println("display() in AnnonymousInnerClassDemo");
				System.out.println("Message : " + msg);

			}
		};

		obj1.show();
		obj1.display("Hello");

		MyInterface1 obj2 = new MyInterface1() {
			public void print() {
				System.out.println("print() in AnnonymousInnerClassDemo");
			}
//		

			@Override
			public void display(String str) {

				System.out.println("display() in AnnonymousInnerClassDemo");

			}

		};

		obj2.print();
		obj2.display("Hi");

	}

}
