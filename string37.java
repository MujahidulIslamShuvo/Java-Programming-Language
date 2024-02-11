import java.util.Scanner;

public class string37 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Clear the scanner buffer
            sc.nextLine();

            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            
            System.out.println("Entered word: " + word);

            for (int n = 1; n <= number; n++) {
                System.out.println(word);
            }
        }
    }
}
