public class overloading_Number_Is_Prime_Or_Not48 {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void isPrimeRange(int range){
        for(int i=2;i<=range;i++){
            if(isPrime(i)){
                System.out.print(i+" ");

            }
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        isPrimeRange(200);
    }
}
