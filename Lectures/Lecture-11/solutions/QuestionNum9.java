public class QuestionNum9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Case 1: Exception occurs
        System.out.println("Case 1: Accessing invalid index");
        try {
            System.out.println("Element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        } finally {
            System.out.println("Finally: This always executes (Case 1)");
        }
        
        // Case 2: No exception
        System.out.println("\nCase 2: Accessing valid index");
        try {
            System.out.println("Element at index 2: " + numbers[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        } finally {
            System.out.println("Finally: This always executes (Case 2)");
        }
    }
}
