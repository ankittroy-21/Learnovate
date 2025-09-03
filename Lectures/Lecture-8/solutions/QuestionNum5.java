import java.util.*;

public class QuestionNum5 {
    public static void main(String[] args) {
        // Array to check if sorted
        int[] d = {10, 20, 15, 40, 50, 13, 38, 60, 89, 2, 25, 67};
        System.out.println("Original Array :" + Arrays.toString(d));
        
        // Create a sorted copy for comparison
        int[] sorted = d.clone();
        Arrays.sort(sorted);
        
        // Check if original equals sorted version
        boolean AreEquals = Arrays.equals(d, sorted);
        
        // Display result
        if (AreEquals == true) {
            System.out.println("Original Array is Already Sorted");
        } else {
            System.out.println("Original Array is not Sorted");
            System.out.println("Sorted Array :" + Arrays.toString(sorted));
        }
    }
}
