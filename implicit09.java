import java.util.*;
public class implicit09 {
    public static void main (String args[]){
        int a = 25;
        long b = a;
        System.out.println(b);
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("enter Something:");
            float number = sc.nextInt();
            System.out.println(number);
        }
    }
    
}
