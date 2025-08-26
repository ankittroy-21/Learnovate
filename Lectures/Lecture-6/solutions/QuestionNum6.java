public class QuestionNum6 {
    public static void main(String[] args) {
        int a = 25, b = 40, c = 15; // Three numbers to compare
        
        // Nested if-else to find the largest number
        if (a >= b) {
            if (a >= c) {
                System.out.println("Largest number: " + a); // a is largest
            } else {
                System.out.println("Largest number: " + c); // c is largest
            }
        } else {
            if (b >= c) {
                System.out.println("Largest number: " + b); // b is largest
            } else {
                System.out.println("Largest number: " + c); // c is largest
            }
        }
    }
}
