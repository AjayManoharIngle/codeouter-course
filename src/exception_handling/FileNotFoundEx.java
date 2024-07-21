package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundEx {

	public static void main(String[] args) {
		
		try {
            // Trying to access a non-existent file
            FileInputStream inputStream = new FileInputStream("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
	}

}
