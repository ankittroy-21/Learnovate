public class QuestionNum4 {
    
    // Method to find maximum of three numbers
    // Takes three integers and returns the largest one
    public static int findMax(int a, int b, int c) {
        int max = a;  // Assume first number is largest initially
        
        // Compare with second number
        if (b > max) {
            max = b;
        }
        
        // Compare with third number
        if (c > max) {
            max = c;
        }
        
        return max;  // Return the largest number
    }
    
    public static void main(String[] args) {
        int maximum = findMax(10, 25, 15);  // Find max among 10, 25, 15
        System.out.println("Maximum number: " + maximum);
    }
}
