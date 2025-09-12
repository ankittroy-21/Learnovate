public class QuestionNum15 {
    public static int sumWithLoops(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                sum += matrix[i][j];
        return sum;
    }
    public static int sumWithEnhancedFor(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix)
            for (int v : row) sum += v;
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(sumWithLoops(matrix));
        System.out.println(sumWithEnhancedFor(matrix));
    }
}
