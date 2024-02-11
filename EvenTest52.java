   /*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method. */
import java.util.Scanner;

public class EvenTest52 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.println("Enter an integer: ");

        // Read the entered integer
        int number = sc.nextInt();

        // Call the isEven method and print the result
        System.out.println("Is the number even? " + isEven(number));

        // Close the Scanner to prevent resource leak
        sc.close();
    }

    // Method to check if an integer is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
         
    }
}

