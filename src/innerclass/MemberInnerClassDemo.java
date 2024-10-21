package innerclass;

public class MemberInnerClassDemo {

	private int number;
	private static String msg;

	class MemberInnerClass {
		void setData(int num, String msg) {
			number = num;
			MemberInnerClassDemo.msg = msg;
		}

		void display() {
			System.out.println("Number is : " + number);
			System.out.println("Member is :" + msg);
		}
	}

}
