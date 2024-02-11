import java.util.Scanner;

public class xplicit10 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Something:");
            float a = 25.12f;
            int b = (int) a;
            System.out.println(b);
            char ch = 'a';
            char ch2 ='b'; 
            int number = ch;
            int number2 = ch2;
            byte b1 = 5;
            byte a1 = (byte) (b1*2);
            System.out.println(number);
            System.out.println(number2);
            System.out.println(a1);
            
        }
    }
    
}
