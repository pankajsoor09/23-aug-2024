package mapassignment;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		HashMap<String, Long> phoneBook = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Phone Book : ");
			System.out.println("1. Add new phone Book entry ");
			System.out.println("2. Search phone number");
			System.out.println("3. Quit");
			System.out.println("** Enter a Valid Choice (1/2/3) **");

			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter Name");
				String name = sc.next();

				System.out.println("Enter phone Number");
				Long phoneNumber = sc.nextLong();

				phoneBook.put(name, phoneNumber);
				System.out.println("Added to Phone Book");
				break;
			case 2:
				System.out.println("Enter Name to fetch number from Phone Book");

				String searchName = sc.nextLine();
				Long phNum = phoneBook.get(searchName);
//				Long is an object, it can store null if the key doesn't exist in the phoneBook.
//				This makes it easier to check whether the entry exists (fNum != null).
				if (phNum != null) {
					System.out.println("Phone number for " + searchName + ": " + phNum);
				} else {
					System.out.println("Name not found in the Phone Book.");
				}
				break;
			case 3:
				System.out.println("Exiting the program");
			default:
              System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}





    
//        do {
//            System.out.println("\nPhone Book Menu:");
//            System.out.println("1. Add new phone book entry");
//            System.out.println("2. Search phone number");
//            System.out.println("3. Quit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline left-over
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter phone number: ");
//                    String phoneNumber = scanner.nextLine();
//                    phoneBook.addEntry(name, phoneNumber);
//                    break;
//                case 2:
//                    System.out.print("Enter name to search: ");
//                    String searchName = scanner.nextLine();
//                    phoneBook.searchPhoneNumber(searchName);
//                    break;
//                case 3:
//                    System.out.println("Exiting the program...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        } while (choice != 3);
//
//        scanner.close();
//    }
//}

