public class QuestionNum6 {
    
    // Method to reverse a string
    // Takes a string parameter and returns reversed string
    public static String reverseString(String text) {
        String reversed = "";  // Initialize empty string for result
        
        // Loop through original string from end to start
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);  // Add characters in reverse order
        }
        
        return reversed;  // Return the reversed string
    }
    
    public static void main(String[] args) {
        String original = "Hello";
        String reversed = reverseString(original);  // Reverse the string
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
