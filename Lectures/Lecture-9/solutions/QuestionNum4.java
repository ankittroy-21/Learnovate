public class QuestionNum4 {
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] result = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[j][i] = matrix[i][j];
        return result;
    }
    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = transpose(matrix);
        print(result);
    }
}
