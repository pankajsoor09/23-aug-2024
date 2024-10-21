package java7features;

import java.util.Scanner;

public class SwitchWithStringDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of Week :");
		String input = sc.next();
		
		switch(input) {
		case "Monday" :
			System.out.println("This is Monday ");
			System.out.println("Working Day");
			break;
		case "Tuesday" :
			System.out.println("This is Tuesday ");
			System.out.println("Working Day");
			break;
		case "Wednesday" :
			System.out.println("This is Wednesday ");
			System.out.println("Working Day");
			break;
		case "Thursday" :
			System.out.println("This is Thursday ");
			System.out.println("Working Day");
			break;
		case "Friday" :
			System.out.println("This is Friday ");
			System.out.println("Working Day");
			break;
		case "Saturday" :
			System.out.println("This is Saturday ");
			System.out.println("Off Day");
			break;
		case "Sunday" :
			System.out.println("This is Monday ");
			System.out.println("Off Day");
			break;
			default : 
				System.out.println("Invalid Week Day");
		}
		
	}

}
