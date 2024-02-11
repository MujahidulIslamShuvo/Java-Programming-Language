import java.util.Scanner;

public class threenumberlarg25 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){
            System.out.println("Number:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
          if ((a>=b) && (a>=c)){
            System.out.println("largest a");
          } else if (b>=c){
            System.out.println("largest b");
          }
          else{
            System.out.println("largest c");
          } 
        }
    }
    
}
