import java.util.*;
public class input08 {
    public static void main(String args[]){
        try (Scanner sc= new Scanner(System.in)){
            System.out.print("Enter Something:");
            int a = sc.nextInt();
            System.out.print(a);

            int b = sc.nextInt();
            System.out.print(b);

            int product = a * b;
            System.out.print(product);
        } 
    }
}
