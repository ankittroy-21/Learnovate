public class QuestionNum8 {
    public static int mainDiagonalSum(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) sum += m[i][i];
        return sum;
    }
    public static int antiDiagonalSum(int[][] m) {
        int sum = 0, n = m.length;
        for (int i = 0; i < n; i++) sum += m[i][n-1-i];
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Main diagonal: " + mainDiagonalSum(matrix));
        System.out.println("Anti-diagonal: " + antiDiagonalSum(matrix));
    }
}
