import java.util.ArrayList;
import java.util.List;

public class QuestionNum1 {
    public static void main(String[] args) {
        // Create a 2D array (matrix) with 3 rows and 3 columns
        int[][] matrix = {
            {1, 2, 3},  // First row
            {4, 5, 6},   // Second row
            {7, 8, 9}    // Third row
        };
        
        // Create an ArrayList to store all elements from the matrix
        List<Integer> list = new ArrayList<>();
        
        // Outer loop: iterate through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Inner loop: iterate through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Add the current element to the list
                list.add(matrix[i][j]);
            }
        }
        
        // Print the resulting list containing all matrix elements
        System.out.println(list);
    }
}
