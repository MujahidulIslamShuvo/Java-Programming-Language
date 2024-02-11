public class Array_kadans {
    public static void kadans(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i =0; i<number.length;i++){
            cs += number[i];
            if(cs<0){
                cs = 0;
            }else{
                ms = Math.max(ms, cs);
            }
        }
        System.out.println("our max sum is "+ms);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        kadans(number);
    }
}
