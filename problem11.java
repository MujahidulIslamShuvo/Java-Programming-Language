import java.util.*;
public class problem11 {
    public static void main(String args[]) {
        /*In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers */
     try (Scanner sc = new Scanner(System.in)){
          System.out.print("Enter Something:");

          double a = sc.nextDouble();
          double b = sc.nextInt();
          double c = sc.nextInt();
          double avrage = (a + b + c)/3;
          System.out.println(avrage);
     }
          
    }
}
