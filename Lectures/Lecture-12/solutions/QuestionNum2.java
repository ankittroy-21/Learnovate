import java.util.Stack;

public class QuestionNum2 {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
    
    public static void main(String[] args) {
        String[] testCases = {
            "({[]})", "({[}])", "((()))", "({)}", "",
            "a + (b * c)", "{[()()]}", "[(])"
        };
        
        for (String test : testCases) {
            boolean result = isBalanced(test);
            System.out.println("Expression: \"" + test + "\" -> " + 
                             (result ? "Balanced" : "Not Balanced"));
        }
    }
}
