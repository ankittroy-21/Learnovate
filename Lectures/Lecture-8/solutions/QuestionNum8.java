import java.util.*;

public class QuestionNum8 {
    public static void main(String[] args) {
        // Array with duplicate elements
        int[] h = {1, 3, 2, 3, 4, 1};
        System.out.println("Original Array :" + Arrays.toString(h));
        System.out.println("Duplicate Elements are : ");
        
        // Nested loop to compare each element with all others
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                if (h[i] == h[j])
                    System.out.println(h[i]);
            }
        }
    }
}
