package exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOEx {

	public static void main(String[] args) {
		 try {
			 // Reads text from a character-input stream
	         // Trying to read from a non-existent file
	            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
	            String line = reader.readLine();
	        } catch (IOException e) {
	            System.out.println("IO error: " + e.getMessage());
	        }
	}
}
