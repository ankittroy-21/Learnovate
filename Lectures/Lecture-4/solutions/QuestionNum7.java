public class QuestionNum7 {
    public static void main(String[] args) {
        double distance = 12345.6789;
        long longDistance = (long) distance;   // narrowing casting
        float floatDistance = (float) distance; // narrowing casting

        System.out.println("Double value: " + distance);
        System.out.println("Long value: " + longDistance);
        System.out.println("Float value: " + floatDistance);
    }
}
