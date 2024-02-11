/*In a program, input the side of a square. You have to output the area of the
square.*/
import java.util.*;
public class problem12 {
    public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter side area:");

        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int area = a * b;
        //System.out.println(area);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of squre is" +area);
      }  
        
    }
    
}
