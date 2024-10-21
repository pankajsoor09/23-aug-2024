package java7features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("M:/Java Development/files/demo.txt")) {
			try (BufferedReader br = new BufferedReader(reader)) {
				String data = null;
				while ((data = br.readLine()) != null) {
					System.out.println(data);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
