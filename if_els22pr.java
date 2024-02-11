import java.util.Scanner;

public class if_els22pr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("number:");
             int A = sc.nextInt();

             if(A % 2 == 0){
                System.out.println("Even");

             }
             else{
                System.out.println("odd:");
             }


        }
    }
}
