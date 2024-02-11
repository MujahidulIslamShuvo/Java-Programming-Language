public abstract class Array_Largest_in_array4 {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            //largest
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            // Check for smallest
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 3, 6, 5,7};
        System.out.println("Largest number is " + getLargest(numbers));
    }
}
