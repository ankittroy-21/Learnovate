public class QuestionNum12 {
    public static int determinant(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(determinant(matrix));
    }
}
