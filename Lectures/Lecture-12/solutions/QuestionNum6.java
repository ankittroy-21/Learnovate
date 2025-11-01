import java.util.Stack;

public class QuestionNum6 {
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch).append(" ");
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop(); // Remove '('
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            }
        }
        
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }
        
        return postfix.toString().trim();
    }
    
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }
    
    public static void main(String[] args) {
        String[] infixExpressions = {
            "A + B * C",
            "(A + B) * C",
            "A + B * C - D / E",
            "A * B + C * D",
            "A + B + C + D"
        };
        
        for (String infix : infixExpressions) {
            String postfix = infixToPostfix(infix);
            System.out.println("Infix: " + infix + " -> Postfix: " + postfix);
        }
    }
}
