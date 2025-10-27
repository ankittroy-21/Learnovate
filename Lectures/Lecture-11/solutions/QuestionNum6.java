public class QuestionNum6 {
    public static void main(String[] args) {
        try {
            // This will cause different exceptions based on input
            String input = args[0];  // Possible ArrayIndexOutOfBoundsException
            int number = Integer.parseInt(input);  // Possible NumberFormatException
            int result = 100 / number;  // Possible ArithmeticException
            System.out.println("Result: " + result);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No input provided");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong");
        }
    }
}
