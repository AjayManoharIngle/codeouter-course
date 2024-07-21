package exception_handling;

import java.io.FileNotFoundException;

public class ThrowsKeyword1 {
	
	// Throws keyword  for checked exception and for runtime exception it is not required  

	public static void main(String[] args) {
		
		try {
            // Call method that throws FileNotFoundException
            readFile("example.txt");
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        }
	}

	public static void readFile(String fileName) throws FileNotFoundException{
        // Attempt to read file
        // If file not found, FileNotFoundException will be thrown
        throw new FileNotFoundException("File not found: " + fileName);
    }
}
