import java.util.*;

public class QuestionNum1 {
    public static void reverse(int[] a) {
        for (int i = 0, r = a.length - 1; i < r; i++, r--) {
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        System.out.println("Original Array :" + Arrays.toString(arr));
        Arrays.sort(arr);
        reverse(arr);
        System.out.println("In Decending Order :" + Arrays.toString(arr));
    }
}
