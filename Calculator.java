// Aman Shrestha [sh1179255@email.ccbcmd.edu]
/**
* Overview: Taking a 4-digit number from the user, and an operator and perform functions.
* Input: Both of the numbers(num1 & num2) seperated and the mathematical operation performed as result.
* Output: Text Display * Variables
* Plan:
* 1. User runs the program
* 2. Ask user for 4-digit number
* 3. Ask user to enten math operator.
* 4. Check if the number has the correct amount of digits
* 5. Seperate the 4-digit number into two numbers of 2-digit
* 6. Apply the mathematical operation to the numbers after seperation using the operator entered by the user
* 7. Avoid mistakes like division by 0, and num1 is not 0.
* 8. Print an output including num1, num2 and result.
* @version: 1.0 March 3, 2024 (today's date)
* @author: Aman Shrestha
* */
    
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = input.nextInt();

        // Check if the number has 4 digits
        if (number < 1000 || number > 9999) {
            System.out.println("Error: Input must be a 4-digit number.");
            return;
        }

        // Ask the user to enter a math operator
        System.out.print("Enter a math operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        // Separate the number into two 2-digit numbers
        int num1 = number / 100;
        int num2 = number % 100;

        // Initialize result variable
        double result = 0;

        // Perform the operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check if num2 is zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        // Display the equation and result
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

