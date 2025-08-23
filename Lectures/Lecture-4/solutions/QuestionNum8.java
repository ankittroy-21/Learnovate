public class QuestionNum8 {
    public static void main(String[] args) {
        char grade = 'A';
        int intGrade = grade;       // widening casting
        double doubleGrade = grade; // widening casting

        System.out.println("Char value: " + grade);
        System.out.println("Int value: " + intGrade);
        System.out.println("Double value: " + doubleGrade);
    }
}
