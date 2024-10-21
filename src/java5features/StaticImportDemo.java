package java5features;

public class StaticImportDemo {
	
	//private static  String msg;
	public static  String msg;
	
	public static  void show() {
		System.out.println("show() in staticImportDemo class ");
		System.out.println("Message is : "+msg);
	}

	public static void display() {
		System.out.println("display() in StaticImportDemo class");
	}
	
}
