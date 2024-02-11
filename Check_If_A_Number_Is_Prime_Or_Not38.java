import java.util.Scanner;

public class Check_If_A_Number_Is_Prime_Or_Not38 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false; // Numbers less than or equal to 1 are not prime
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break; // If a factor is found, no need to continue checking
                    }
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
