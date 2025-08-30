public class QuestionNum2 {
    
    // Method to calculate sum of two numbers
    // Takes two integer parameters and returns their sum
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;  // Add the two numbers
        return sum;             // Return the result
    }
    
    public static void main(String[] args) {
        int result = calculateSum(5, 3);  // Call method with arguments 5 and 3
        System.out.println("Sum: " + result);  // Print the result
    }
}
