import java.util.Scanner;

public class whileLoop28 {
    public static void main(String [] args){
        //int counter = 0;
        //while (counter<100) {
            //System.out.println("hello world"); 
            //counter++;  
            try (Scanner sc = new Scanner(System.in)){
                System.out.print("Number:");
                int range =sc.nextInt();
                int counter = 1;
                while (counter <= range) {
                    System.out.print(counter + " ");
                    counter++;
                }
            }        
        }
        
    }

