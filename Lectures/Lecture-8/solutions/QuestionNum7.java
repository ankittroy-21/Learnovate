import java.util.*;

public class QuestionNum7 {
    public static void main(String[] args) {
        // Array to find second largest number in
        int[] g = {10, 20, 4, 45, 99};
        System.out.println("Original Array :" + Arrays.toString(g));
        
        // Sort the array in ascending order
        Arrays.sort(g);
        
        // Second largest is at length-2 position
        int SecondMax = g[g.length - 2];
        System.out.println("Second Largest Number is : " + SecondMax);
    }
}
