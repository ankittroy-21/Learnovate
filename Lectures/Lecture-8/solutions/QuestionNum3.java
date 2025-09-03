import java.util.*;

public class QuestionNum3 {
    // Method to count occurrences of a specific number
    public static int Count(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }   
        }
        return count;
    }

    public static void main(String[] args) {
        // Array to count frequencies in
        int[] b = {1, 2, 2, 3, 3, 3};
        System.out.println("Original Array :" + Arrays.toString(b));
        
        // Count and display frequency of each number
        System.out.println("The Frequency of 1 in the array is :" + Count(b, 1) + " times");
        System.out.println("The Frequency of 2 in the array is :" + Count(b, 2) + " times");
        System.out.println("The Frequency of 3 in the array is :" + Count(b, 3) + " times");
    }
}
