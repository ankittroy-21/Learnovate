import java.util.*;

public class QuestionNum6 {
    public static void main(String[] args) {
        // Original array with both even and odd numbers
        int[] e = {3, 20, 15, 40, 50, 13, 38, 60, 89, 2, 25, 67};
        
        // Temporary array to store even numbers (may have zeros)
        int[] even = new int[e.length];
        for (int i = 0; i < e.length; i++) {
            if (e[i] % 2 == 0) {
                even[i] = e[i];
            }
        }
        
        System.out.println("Original Array :" + Arrays.toString(e));
        
        // Count how many non-zero (even) numbers we have
        int var1 = 0;
        for (int i = 0; i < e.length; i++) {
            if (even[i] != 0) {
                var1++;
            }
        }
        
        // Create new array with exact size for even numbers
        int[] var2 = new int[var1];
        int index = 0;
        
        // Copy non-zero values to new array
        for (int i = 0; i < e.length; i++) {
            if (even[i] != 0) {
                var2[index++] = even[i];
            }
        }
        
        // Sort for better presentation
        Arrays.sort(var2);
        System.out.println("New Array with Even Numbers Only :" + Arrays.toString(var2));
    }
}
