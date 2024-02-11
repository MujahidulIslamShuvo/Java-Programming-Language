import java.util.Scanner;

public class QuestionContinueKeyword37 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            do{
              System.out.print("number:");
            int Number = sc.nextInt();
            if(Number %10 ==0){
                continue;
            }
            System.out.println(Number);
           }while(true);
            
        }
    }
}
