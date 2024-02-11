public class Array_Kadans_negetive {
    public static int findMaxElement(int number[]) {
        int maxElement = Integer.MIN_VALUE;
        
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxElement) {
                maxElement = number[i];
            }
        }
        
        return maxElement;
    }
    
    public static void main(String[] args) {
        int number[] = {-3, -2, -5, -4, -1};
        int maxElement = findMaxElement(number);
        
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
