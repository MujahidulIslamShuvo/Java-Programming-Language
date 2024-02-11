import java.util.*;
public class input06 {
    /**
     * @param args
     */
    public static void main (String args[]){
        
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Something:");
            int a = sc.nextInt();
            System.out.println(a);
            int b = sc.nextInt();
            System.out.println(b);
            int sum = a + b;
            System.out.println(sum);
            

        }
    }
    
}
