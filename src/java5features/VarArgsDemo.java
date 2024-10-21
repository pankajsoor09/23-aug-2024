package java5features;

public class VarArgsDemo {
	
	void add(int num1,int num2, int... num) {
		int result = num1 + num2;
		for(int a : num) {
			result +=a; //result = result +a;
			
		}
		System.out.println("Addition Result is : "+result);
	}
	
	public static void main (String [] args) {
		VarArgsDemo demo = new VarArgsDemo();
		demo.add(10, 20);
		demo.add(10, 20,30);
		demo.add(10, 20,30,40,50);
		demo.add(10, 20,30,40,50,60,70,80,90,100);
	}

}
