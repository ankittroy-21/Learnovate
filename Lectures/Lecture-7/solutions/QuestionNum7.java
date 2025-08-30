public class QuestionNum7 {
    
    // Method to check if a number is prime
    // Takes an integer and returns boolean
    public static boolean isPrime(int number) {
        // Numbers less than 2 are not prime
        if (number <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to number/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;  // Not prime if divisible
            }
        }
        
        return true;  // Prime if no divisors found
    }
    
    public static void main(String[] args) {
        boolean result = isPrime(17);  // Check if 17 is prime
        System.out.println("Is 17 prime? " + result);
    }
}
