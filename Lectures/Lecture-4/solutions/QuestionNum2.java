public class QuestionNum2 {
    public static void main(String[] args) {
        float marks = 89.56f;
        int intMarks = (int) marks;     // narrowing casting
        double doubleMarks = marks;     // widening casting

        System.out.println("Float value: " + marks);
        System.out.println("Integer value: " + intMarks);
        System.out.println("Double value: " + doubleMarks);
    }
}
