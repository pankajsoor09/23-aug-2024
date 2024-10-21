package java8features;

public interface MyInterface {

	default void show() { // add default
		System.out.println("default show() in MyInterface ");
	}

	default void show(String msg) {
		System.out.println("default show(String) in MyInterface");
		System.out.println("Message is : " + msg);
	}

	static void display() {
		System.out.println("static display() in MyInterface ");
	}

	static void display(String msg) {
		System.out.println("static display(String) in MyInterface ");
		System.out.println("Message is : " + msg);
	}

	void print();// abstract method

	public static void main(String[] args) {
		display();// if main method in another class then need to call by classname.methodname
		MyInterface obj = new MyClass();// upcasting
		obj.show();
		obj.print();

	}

}
