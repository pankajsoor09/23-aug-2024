package java5features;

import java.util.Scanner;

public class SeasonMain {

	public static void main(String[] args) {

		System.out.println("Enter Season Name : ");
		Scanner sc = new Scanner (System.in);
		String input = sc.next();
		
		Season[] seasons = Season.values();
		
		boolean status = false;
		
		for(Season s : seasons) {
			if(s.toString().equalsIgnoreCase(input)) {
				System.out.println("Valid Season");
				status = true;
				break;
			}
		}
		
		if(status == false) {
			System.out.println("Invalid Season");
		}
		
		Season.SUMMER.show();// this is summer and int value pass in summer will be output //can't create object 
		                    
		
	}

}
