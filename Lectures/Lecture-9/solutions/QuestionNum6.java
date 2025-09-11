public class QuestionNum6 {
    public static int[][] multiply(int[][] A, int[][] B) {
        int r1 = A.length, c1 = A[0].length, r2 = B.length, c2 = B[0].length;
        if (c1 != r2) throw new IllegalArgumentException("Invalid dimensions for multiplication");
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    res[i][j] += A[i][k] * B[k][j];
        return res;
    }
    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};
        int[][] result = multiply(A, B);
        print(result);
    }
}
