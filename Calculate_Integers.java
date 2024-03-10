// Aman Shrestha [sh1179255@email.ccbcmd.edu]
/**
* Overview: 
1.Import necessary classes: java.io.File, java.io.FileNotFoundException, and java.util.Scanner.
2.Define the IntegerCounter class.
3.Define the countIntegers method with a throws FileNotFoundException declaration.
4.Initialize a variable count to keep track of the number of integers found.
5.Create a File object representing the input file using the provided filename.
6.Check if the file exists using the exists() method of the File class. If not, print an error message and return 0.
7.Create a Scanner object to read from the file.
8.Loop through each token in the file using a while loop with the condition scanner.hasNext().
9.Inside the loop, check if each token is an integer using the hasNextInt() method of the Scanner class.
10.If a token is an integer, increment the count variable and consume the integer token using the nextInt() method.
11.Return the total count of integers found.
12.Define the main method.
13.Create an instance of the IntegerCounter class.
14.Specify the filename of the input file.
15.Call the countIntegers method with the input filename to count the integers in the file.
16.Print the total count of integers found or a message indicating that no integers were found.

* @version: 1.0 March 9, 2024 (today's date)
* @author: Aman Shrestha
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class IntegerCounter {
    // Method to count integers in a file
    // Throws FileNotFoundException if the file is not found
    private int countIntegers(String filename) throws FileNotFoundException {
        // Initialize a counter to keep track of the number of integers found
        int count = 0;
        // Create a File object representing the input file
        File file = new File(filename);
        // Check if the file exists
        if (!file.exists()) {
            // If the file doesn't exist, print an error message and return 0
            System.out.println("Error: File '" + filename + "' not found.");
            return count;
        }
        // Create a Scanner object to read from the file
        Scanner scanner = new Scanner(file);
        // Iterate through each token in the file
        while (scanner.hasNext()) {
            // Check if the next token is an integer
            if (scanner.hasNextInt()) {
                // If it is, increment the counter
                count++;
                // Consume the integer token
                scanner.nextInt();
            } else {
                // If it's not an integer, move to the next token
                scanner.next();
            }
        }
        // Close the scanner to release resources
        scanner.close();
        // Return the total count of integers found in the file
        return count;
    }

    // Main method to execute the program
    public static void main(String[] args) throws FileNotFoundException {
        // Create an instance of IntegerCounter class
        IntegerCounter counter = new IntegerCounter();
        // Specify the filename of the input file
        String filename = "input.txt"; // Change this if the input file has a different name
        // Call the countIntegers method to count integers in the file
        int count = counter.countIntegers(filename);
        // Print the result
        if (count > 0) {
            // If integers are found, print the total count
            System.out.println(count + " total integers found.");
        } else {
            // If no integers are found, print a message indicating that
            System.out.println("No integer values found in the file.");
        }
    }
}
