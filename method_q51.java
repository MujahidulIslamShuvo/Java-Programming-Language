import java.util.Scanner;
//Write a Java method to compute the average of three numbers..
public class method_q51 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first Number:");
            double x = sc.nextDouble();
            System.out.println("Enter Second Number:");
            double y = sc.nextDouble();
            System.out.println("Enter Third Number:");
            double z = sc.nextDouble();

            // Call the average method and store the result in a variable
            double average = average(x, y, z);

            // Print the result
            System.out.println("The average is: " + average);
        }
    }

    public static double average(double x, double y, double z) {
        // Corrected the parentheses in the average calculation
        return (x + y + z) / 3;
    }


}
