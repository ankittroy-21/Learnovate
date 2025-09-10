import java.util.Arrays;

public class QuestionNum2 {
    public static void main(String[] args) {
        // Create a 2D array (grid) with 3 rows and 2 columns
        int[][] grid = {
            {1, 2},  // First row
            {3, 4},   // Second row
            {5, 6}    // Third row
        };
        
        // Calculate row sums
        // Create an array to store sum of each row
        int[] rowSum = new int[grid.length];
        
        // Outer loop: iterate through each row
        for (int i = 0; i < grid.length; i++) {
            int sum = 0;  // Initialize sum for current row
            
            // Inner loop: iterate through each column in current row
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];  // Add each element to row sum
            }
            
            rowSum[i] = sum;  // Store the row sum in the array
        }
        
        // Print the row sums
        System.out.print("Row sums: ");
        System.out.println(Arrays.toString(rowSum));
        
        // Calculate column sums
        // Create an array to store sum of each column
        int[] colSum = new int[grid[0].length];
        
        // Outer loop: iterate through each column
        for (int i = 0; i < grid[0].length; i++) {
            int sum = 0;  // Initialize sum for current column
            
            // Inner loop: iterate through each row for current column
            for (int j = 0; j < grid.length; j++) {
                sum += grid[j][i];  // Add each element to column sum
            }
            
            colSum[i] = sum;  // Store the column sum in the array
        }
        
        // Print the column sums
        System.out.print("Column sums: ");
        System.out.println(Arrays.toString(colSum));
    }
}
