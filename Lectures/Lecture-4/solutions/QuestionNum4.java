public class QuestionNum4 {
    public static void main(String[] args) {
        short age = 45;
        byte byteAge = (byte) age;   // narrowing casting
        float floatAge = age;        // widening casting

        System.out.println("Short value: " + age);
        System.out.println("Byte value: " + byteAge);
        System.out.println("Float value: " + floatAge);
    }
}
