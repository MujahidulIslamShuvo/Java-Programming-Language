import java.util.Scanner;
public class Loopsum29 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter n:");
            int n = sc.nextInt();
            int i = 1;
            int sum = 0;
            while(i<=n){
                sum += i;
                i++;
            }
             System.out.println("sum is:"+sum);
        }
    }
}
