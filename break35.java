import java.util.Scanner;

public class break35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Number: ");
                int n = sc.nextInt();
                if (n % 10 == 0) {
                    break; 
                }
            } while (true);
        System.out.println(); 
        }
    }
}
