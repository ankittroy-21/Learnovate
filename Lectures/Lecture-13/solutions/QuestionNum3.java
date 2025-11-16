import java.util.*;

public class QuestionNum3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        
        reverseFirstK(queue, 3);
        System.out.println(queue); // [3, 2, 1, 4, 5]
    }
    
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k > queue.size()) return;
        
        Stack<Integer> stack = new Stack<>();
        
        // Push first k elements to stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        
        // Add them back to queue (reversed)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        
        // Move remaining elements to end
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }
}
