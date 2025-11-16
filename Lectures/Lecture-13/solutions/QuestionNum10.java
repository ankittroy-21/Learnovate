import java.util.*;

public class QuestionNum10 {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        firstNegativeInWindow(arr, k); // -1 -1 -7 -15 -15 0
    }
    
    public static void firstNegativeInWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) return;
        
        Queue<Integer> queue = new LinkedList<>();
        
        // Process first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) queue.add(i);
        }
        
        // Process remaining windows
        for (int i = k; i < arr.length; i++) {
            // Print first negative of previous window
            if (!queue.isEmpty()) {
                System.out.print(arr[queue.peek()] + " ");
            } else {
                System.out.print("0 ");
            }
            
            // Remove elements not in current window
            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.remove();
            }
            
            // Add current element if negative
            if (arr[i] < 0) queue.add(i);
        }
        
        // Print first negative for last window
        if (!queue.isEmpty()) {
            System.out.print(arr[queue.peek()] + " ");
        } else {
            System.out.print("0 ");
        }
    }
}
