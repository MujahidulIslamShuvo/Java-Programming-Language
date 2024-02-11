import java.util.Scanner;
public class Syntax_With_Parameters42 {
public static int calculetsum(int num1,int num2){//formal parametars
    int sum = num1 + num2;
    return sum;
   }
   public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        int sum = calculetsum(a,b);//actual parameters
        System.out.println(sum);

    }
   }

}

