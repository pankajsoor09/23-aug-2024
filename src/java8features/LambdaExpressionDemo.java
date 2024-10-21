package java8features;

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		FunctionalInterfaceDemo demo = () -> {
			System.out.println("show() in LambdaExpressionDemo");
			System.out.println("This is LambadExpression");
		};
		demo.show();

		MyInterface demo1 = () -> System.out.println("print() in LambdaExpressionDemo class");
		// if single line implementation is there then we can give or not give
		// curly bracket but in multi line implementation curly bracket is needed

		demo1.print();
		
		Calculator demo2 = (num1 , num2) ->  System.out.println("Addition Result of "+num1 +"and"+ num2 +"is : "+(num1+num2));
		demo2.add(50, 20);
		
		Greeting demo3 = (msg) -> { 
			System.out.println(" Inside print() in Greeting Interface");
			System.out.println("Message is :"+msg);
			
		};
		
		demo3.print("Welcome");
		
		Greeting demo4 = msg -> {// if there is only one argument then we can exclude writing () bracket
			System.out.println("Inside prit() of Greeting in LambdaExpression Demo");
			System.out.println("Message is :"+msg);
		};
		demo4.print("LambdaExpression");
		
		Addition demo5 = (num1,num2) ->{return num1+num2;   // if single line has return statement then curly brackets are required
			
		};
		int result = demo5.add(20, 30);
		System.out.println("Addition Result of 20 and 30 : "+result);
		
		Addition demo6 = (num1, num2) -> num1+num2; // if result is not used then curly bracket can be omitted. or be avoid using
		result = demo6.add(50, 27);
		System.out.println("Addition Result of 50 and 27 : "+result);
		
		Addition demo7 = (num1,num2) -> {
			System.out.println("Inside add() ");
			return num1+num2;
			
		};
		result = demo7.add(80, 17);
		System.out.println("Addition Result of 80 and 17 : "+result);

		}

}
