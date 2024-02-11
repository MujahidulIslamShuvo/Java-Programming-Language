public class Decimal_To_Binary50 {
    public static void DecToBin(int n){
        int mynum = n;
        int pow=0;
        int bin=0; 
        while(n!=0){
            int rem = n%2;
            n = n/2;
            bin+=(rem*(int)Math.pow(10, pow));
            pow++;     
        }
       System.out.println("Binary form of"+mynum+"is"+bin);
    }
    public static void main(String[] args) {

        DecToBin(7);
    }
}
