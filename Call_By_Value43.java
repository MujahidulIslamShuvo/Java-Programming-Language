public class Call_By_Value43 {
   public static void swap(int a ,int b){
    //swap
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a =" + a);
    System.out.println("b =" + b);
    return;
   }
   public static void main(String args[]){
    //swap-value exchange
    int a = 5;
    int b = 10;
    swap(a,b);
       
   }
}


