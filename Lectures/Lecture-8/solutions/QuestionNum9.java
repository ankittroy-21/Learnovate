import java.util.*;

public class QuestionNum9 {
    public static void main(String[] args) {
        // Two sorted arrays to merge
        int[] j = {1, 3, 5};
        int[] k = {2, 4, 6};
        System.out.println("First Array :" + Arrays.toString(j));
        System.out.println("Second Array :" + Arrays.toString(k));
        
        // Create array large enough to hold both arrays
        int[] merge = new int[j.length + k.length];
        
        // Copy first array
        for (int i = 0; i < j.length; i++) {
            merge[i] = j[i];
        }

        // Copy second array after first
        for (int i = 0; i < k.length; i++) {
            merge[j.length + i] = k[i];
        }
        
        // Sort the merged array
        Arrays.sort(merge);
        System.out.println("Merged And Sorted Array is : " + Arrays.toString(merge));
    }
}
