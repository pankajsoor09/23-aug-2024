package java8features;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	void show();
	default void display() {
		System.out.println("default display () method in FunctionalInterfaceDemo");
	}
	default void display(String msg) {
		System.out.println("Message is : "+msg);
	}

	static void print() {
		System.out.println("static print() in FunctionalInterfaceDemo");
	}
	static void display(int number) {
		System.out.println("static display(int) in FunctionalInterfaceDemo");
		System.out.println("Number is : "+number);
	}
}
