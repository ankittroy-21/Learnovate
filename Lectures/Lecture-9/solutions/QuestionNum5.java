public class QuestionNum5 {
    public static int[][] add(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        if (B.length != r || B[0].length != c)
            throw new IllegalArgumentException("Dimension mismatch");
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] result = add(A, B);
        print(result);
    }
}
