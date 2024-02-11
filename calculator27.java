import java.util.Scanner;

public class calculator27 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("First number :");
            int a = sc.nextInt();

            System.out.println("Secound number :");
            int b = sc.nextInt();
            
            System.out.println("Enter oprators :");
            char operators = sc.next().charAt(0);

            switch(operators){
                case '+' :
                System.out.println(a+b);
                 break;
                case '-' :
                System.out.println(a-b);
                 break;
                case '*' :
                System.out.println(a*b);
                 break;
                case '/' :
                System.out.println(a/b);
                 break;
                case '%' :
                System.out.println(a%b);
                default :
                System.out.println("wrong operator");
            }
        }
    }
}
