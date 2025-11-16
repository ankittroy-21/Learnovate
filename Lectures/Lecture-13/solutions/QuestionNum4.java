import java.util.*;

public class QuestionNum4 {
    public static void main(String[] args) {
        generateBinaryNumbers(5); // 1, 10, 11, 100, 101
    }
    
    public static void generateBinaryNumbers(int n) {
        if (n <= 0) return;
        
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        
        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");
            
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}
