import java.util.*;

public class QuestionNum4 {
    public static void reverse(int[] a) {
        // Reverse the array by swapping elements from start and end
        for (int i = 0, r = a.length - 1; i < r; i++, r--) {
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        // Array to reverse
        int[] c = {10, 20, 30, 40, 50};
        System.out.println("Original Array :" + Arrays.toString(c));
        
        // Reverse the array
        reverse(c);
        System.out.println("Reversed Array :" + Arrays.toString(c));
    }
}
