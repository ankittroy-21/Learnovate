public class QuestionNum9 {
    public static int countElement(int[][] matrix, int target) {
        int count = 0;
        for (int[] row : matrix)
            for (int v : row)
                if (v == target) count++;
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        System.out.println("Zeros count: " + countElement(matrix, 0));
    }
}
