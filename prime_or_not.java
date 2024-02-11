import java.util.Scanner;

public class prime_or_not {
public static void main(String[] args) {
       try(Scanner sc = new Scanner (System.in)){
              System.out.print("Enter Number:");
              int N = sc.nextInt();
              boolean isPrime = true;
              for(int i = 2;i <=N-1;i++){
                     if(N%i==0){
                            isPrime = false;
                     }
              }
              if(isPrime == true){
                     System.out.println("Prime");
              }else if(isPrime == false){
                     System.out.println("not Prime");

              }
       }
}
}