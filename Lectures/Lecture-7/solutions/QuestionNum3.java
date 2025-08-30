public class QuestionNum3 {
    
    // Method to check if a number is even
    // Takes an integer parameter and returns boolean
    public static boolean isEven(int number) {
        // Check if number is divisible by 2 (even)
        if (number % 2 == 0) {
            return true;  // Return true if even
        } else {
            return false; // Return false if odd
        }
    }
    
    public static void main(String[] args) {
        boolean result = isEven(10);  // Check if 10 is even
        System.out.println("Is 10 even? " + result);
    }
}
