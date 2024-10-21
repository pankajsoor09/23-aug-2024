package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		//Employee emp = new Employee();
		//Class demo = emp.getClass();
		
		try {
			Class demo = Class.forName("reflection.Employee");
			
			//Class demo = Employee.class;
			
			Employee emp = (Employee) demo.newInstance();
			Constructor constructor = demo.getDeclaredConstructor();
			emp = (Employee)constructor.newInstance();// object creation
			
			

			Constructor[] constructors = demo.getConstructors();

			System.out.println("Employee  constructor");

			for (Constructor c : constructors) {
				System.out.println(c);
			}
			System.out.println("-------------------------------");

			// Method[] methods = demo.getMethods();
			// getMethods() method of class will return all the method of class ,even method which are getting 
			// inherited from super class
			// However getDeclaredMethod() method of Class class will return only declared method in that class 
			Method[] methods = demo.getDeclaredMethods();
			System.out.println("Method in Employee Class");
			for (Method m : methods) {
				System.out.println(m);
			}
			System.out.println("-------------------------------");

			// Field [] fields = demo.getFields();// only return public fields
			// getFields() method of Class class will return only public fields (data members)
			// getDeclaredFields() method of Class class will return all (private,default, protected,public ) fields (data members)
			Field[] fields = demo.getDeclaredFields();
			System.out.println("Fields in Employee Class");
			for (Field f : fields) {
				System.out.println(f);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
