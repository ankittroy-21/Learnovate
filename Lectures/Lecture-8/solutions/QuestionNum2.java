import java.util.*;

public class QuestionNum2 {
    public static void main(String[] args) {
        // Array to find first and last occurrence in
        int[] a = {4, 2, 7, 4, 9, 4};
        int key = 4; // Number to find
        
        // Find first occurrence
        int f = 0;
        while (f < a.length && a[f] != key) {
            f++;
        }
        
        // Find last occurrence
        int n = a.length - 1;
        while (n >= 0 && a[n] != key) {
            n--;
        }
        
        // Display results
        if (f == a.length) {
            System.out.println("The Number is not Found in the array");
        } else {
            System.out.println("Original Array :" + Arrays.toString(a));
            System.out.println("The First Occurance of Number " + key + " is at Index " + f);
            System.out.println("The Last Occurance of Number " + key + " is at Index " + n);
        }
    }
}
