import java.util.Stack;

public class QuestionNum5 {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");
        
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();
    }
    
    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private static int performOperation(String operator, int a, int b) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": 
                if (b == 0) throw new ArithmeticException("Division by zero!");
                return a / b;
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    public static void main(String[] args) {
        String[] expressions = {
            "5 3 +",           // 8
            "5 3 + 2 *",       // 16
            "10 5 - 3 *",      // 15
            "15 3 / 2 +",      // 7
            "2 3 4 * +",       // 14
            "10 2 3 * - 5 +"   // 9
        };
        
        for (String expr : expressions) {
            int result = evaluatePostfix(expr);
            System.out.println("Postfix: \"" + expr + "\" = " + result);
        }
    }
}
