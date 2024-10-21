package innerclass;

public class MethodLocalInnerClassDemo {
	
	private static int number;
	private String msg;
	
	void setData(int number , String msg) {
		MethodLocalInnerClassDemo.number = number;
		this.msg=msg;
	}
	
	void display() {
		int count = 10;
		class MethodLocalInnerClass{
			void printData() {
				System.out.println("Number : "+number);
				System.out.println("Message is  : "+msg);
				System.out.println("Count is  : "+count);
			}
		}
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.printData();
	}

}
