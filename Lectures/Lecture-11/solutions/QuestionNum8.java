public class QuestionNum8 {
    public static void main(String[] args) {
        System.out.println("Problem: General Exception catch block comes before specific one");
        System.out.println("Fix: Reorder catch blocks - specific first, general last");
        
        // CORRECTED CODE:
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }
}
