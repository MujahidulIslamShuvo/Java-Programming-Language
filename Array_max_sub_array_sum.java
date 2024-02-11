public class Array_max_sub_array_sum{
    public static void MaxsubarraySum(int number[]){
        int currentsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
            int start = i;
            for(int j = i;j<number.length;j++){
                int end = j;
                currentsum = 0;
                for(int k = start;k<=end ; k++){
                    currentsum += number[k];
                }
                System.out.println(currentsum);
                if(maxSum<currentsum){
                    maxSum = currentsum;
                }
            }
        }
        System.out.println("Max Sum ="+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        MaxsubarraySum(number);
    }
}