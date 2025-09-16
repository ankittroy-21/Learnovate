public class QuestionNum10 {
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] != matrix[j][i])
                    return false;
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(isSymmetric(matrix));
    }
}
