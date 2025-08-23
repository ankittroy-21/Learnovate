public class QuestionNum5 {
    public static void main(String[] args) {
        byte level = 120;
        double doubleLevel = level;  // widening casting
        short shortLevel = level;    // widening casting

        System.out.println("Byte value: " + level);
        System.out.println("Double value: " + doubleLevel);
        System.out.println("Short value: " + shortLevel);
    }
}
