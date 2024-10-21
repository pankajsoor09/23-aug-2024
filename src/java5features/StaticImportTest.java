package java5features;
import static java5features.StaticImportDemo.*;
//import static java5features.StaticImportDemo.msg;
public class StaticImportTest {
	
	public static void main(String[] args) {
		msg = "Hello";
		show(); 
		display();
	}

}
