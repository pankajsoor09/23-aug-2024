package wrapper;

public class WrapperDemo {

	public static void main(String[] args) {

		Integer obj1 = new Integer (10);//Primitive to wrapper object conversion : Boxing
		System.out.println("obj1 : "+obj1);
		
		Float obj2 = new Float("20.5F");
		System.out.println("obj2 : "+obj2);
		
		Double obj3 = new Double ("45.5f");
		System.out.println("obj3 : "+obj3);
		
		//Short obj4 = new Short("40f");//As we are not passing proper numeric value for short will get 
		                               // NumberFormatException
		//System.out.println("obj4 : "+obj4);
		
		//before jdk 1.5 for performing operation on wrapper object
		int a = obj1.intValue(); // wrapper object to primitive conversion : unboxing
		obj1 = new Integer(a+50); //Primitive to wrapper object conversion : Boxing
		System.out.println("After adding 50 : "+obj1);
		
		//After jdk 1.5 as Auto Boxing and auto unboxing
		obj2 =obj2+100;// Auto unboxing to perform  addition operation then auto boxing to create wrapper
		               // object with new primitive value
		System.out.println("After adding 100 : "+obj2);
		
		Integer obj4 = 20 ;//Autoboxing
		System.out.println("obj4 : "+obj4);
		
		Double obj5 = Double.valueOf(25.5);//Boxing : converting primitive into wrapper object
		System.out.println("obj5 : "+obj5);
		
		Long obj6 =Long.valueOf("50");
		System.out.println("Obj6 : "+obj6);
		
		//Long obj7 = Long.valueOf("50.5");//NumberFormatException
		//System.out.println("obj7 : "+obj7);
		
		short s = Short.parseShort("70");//parse method is used to convert string into primitive
		System.out.println("s : "+s);
		
		//s = Short.parseShort("70.5");//NumberFormatException
		
		double d = Double.parseDouble("55.5");
		System.out.println("d : "+d);
		
	}

}
