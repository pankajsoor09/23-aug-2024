package innerclass;
import innerclass.MemberInnerClassDemo.MemberInnerClass;
public class MemberInnerClassDemoMain {
	
	public static void main(String[] args) {
		
		MemberInnerClassDemo demo = new MemberInnerClassDemo();
		MemberInnerClass obj = demo.new MemberInnerClass();
		obj.setData(10,"Hello");
		obj.display();
		
	}

}
