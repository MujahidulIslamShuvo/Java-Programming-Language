public class binary_To_Decimal49 {
     public static void BinToDec(int BinNum){
        int mynum = BinNum;
        int pow = 0;
        int dec = 0;
        while(BinNum!=0){
            int lastnumber = BinNum%10;
            BinNum = BinNum/10;
            
            dec = dec+(lastnumber*(int) Math.pow(2, pow));
            pow++;
            
             
        }
        System.out.println("decimal of" + mynum +" = " + dec);

     }
     public static void main(String[] args) {
        // Example usage
        int binaryNumber = 10101;
        BinToDec(binaryNumber);
    }
}
