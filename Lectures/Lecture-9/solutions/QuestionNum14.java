public class QuestionNum14 {
    public static void findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE, row = -1, col = -1;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i; col = j;
                }
        System.out.println("Maximum: " + max + " at position (" + row + ", " + col + ")");
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 3}, {9, 2, 8}, {4, 7, 6}};
        findMax(matrix);
    }
}
