package java7features;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import input_output.Product; // from input_output pack in 23 aug 

public class MultipleExceptionsInSingleCatch {

	public static void main(String[] args) {

		// Outer try-with-resources to handle FileInputStream
		try (FileInputStream fin = new FileInputStream("M:/Java Development/files/Product.txt")) {

			// Inner try-with-resources to handle ObjectInputStream
			try (ObjectInputStream in = new ObjectInputStream(fin)) {
				Product product = (Product) in.readObject();
				System.out.println("Product Details: " + product);

			} 
		} catch (IOException  |ClassNotFoundException e ) {
			e.printStackTrace();
		}
	}
}
