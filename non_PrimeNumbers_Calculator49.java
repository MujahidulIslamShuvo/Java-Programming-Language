public class non_PrimeNumbers_Calculator49 {
        public static boolean isPrime(int n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static void calculateNonPrimeNumbers(int start, int end) {
            System.out.println("Non-prime numbers in the range from " + start + " to " + end + ":");
            for (int i = start; i <= end; i++) {
                if (!isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // Move to a new line after printing non-prime numbers
        }
    
    
        public static void main(String[] args) {
           
            int rangeStart = 1;
            int rangeEnd = 50; // Change the range accordingly
          
           
            calculateNonPrimeNumbers(rangeStart, rangeEnd);
        }
    
    
    
}
