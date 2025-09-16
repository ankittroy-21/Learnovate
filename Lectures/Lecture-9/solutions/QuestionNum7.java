public class QuestionNum7 {
    public static void findRows(int[][] jagged) {
        int maxLen = 0, minLen = Integer.MAX_VALUE, maxRow = -1, minRow = -1;
        for (int i = 0; i < jagged.length; i++) {
            int len = jagged[i].length;
            if (len > maxLen) {
                maxLen = len;
                maxRow = i;
            }
            if (len < minLen) {
                minLen = len;
                minRow = i;
            }
        }
        System.out.println("Max row: " + maxRow + " (" + maxLen + " elements)");
        System.out.println("Min row: " + minRow + " (" + minLen + " elements)");
    }
    public static void main(String[] args) {
        int[][] jagged = {{1, 2}, {3, 4, 5}, {6}};
        findRows(jagged);
    }
}
