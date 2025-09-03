import java.util.*;

public class QuestionNum10 {
    // Binary search implementation
    public static int binarySearch(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        // Sorted array to search in
        int[] o = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array :" + Arrays.toString(o));
        
        int q = 7; // Length of array
        int target = 7; // Element to find
        
        // Perform binary search
        int result = binarySearch(o, q, target);
        
        // Display result
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
