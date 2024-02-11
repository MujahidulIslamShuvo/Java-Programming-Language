import java.util.*;
public class input07 {
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter something:");

            float red = sc.nextFloat();
            float area = 3.14f * red * red; 
            System.out.print(area);


        }

    }
}
