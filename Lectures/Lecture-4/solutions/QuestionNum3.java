public class QuestionNum3 {
    public static void main(String[] args) {
        long population = 9876543210L;
        int intPopulation = (int) population;  // narrowing casting
        double doublePopulation = population;  // widening casting

        System.out.println("Long value: " + population);
        System.out.println("Int value: " + intPopulation);
        System.out.println("Double value: " + doublePopulation);
    }
}
