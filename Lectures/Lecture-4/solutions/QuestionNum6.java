public class QuestionNum6 {
    public static void main(String[] args) {
        int salary = 50000;
        float floatSalary = salary;     // widening casting
        short shortSalary = (short) salary;  // narrowing casting

        System.out.println("Int value: " + salary);
        System.out.println("Float value: " + floatSalary);
        System.out.println("Short value: " + shortSalary);
    }
}
