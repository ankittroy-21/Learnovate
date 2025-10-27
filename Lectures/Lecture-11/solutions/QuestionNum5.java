public class QuestionNum5 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This line throws ArithmeticException
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred"); // This will execute
        } catch (Exception e) {
            System.out.println("General error occurred"); // This won't execute
        } finally {
            System.out.println("Finally block executed"); // This will always execute
        }
    }
}

/* 
Execution Flow:
1. Try block starts execution

2. 10 / 0 throws ArithmeticException

3. Control jumps to first matching catch block (ArithmeticException)

4. "Arithmetic error occurred" is printed

5. Finally block executes regardless of exception

6. "Finally block executed" is printed
*/
