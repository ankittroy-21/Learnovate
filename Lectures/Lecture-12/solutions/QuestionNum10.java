import java.util.Stack;

public class QuestionNum10 {
    
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }
    
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original Stack: " + stack);
        
        reverseStack(stack);
        
        System.out.println("Reversed Stack: " + stack);
        
        // Test with empty stack
        Stack<Integer> emptyStack = new Stack<>();
        System.out.println("Empty Stack before: " + emptyStack);
        reverseStack(emptyStack);
        System.out.println("Empty Stack after: " + emptyStack);
        
        // Test with single element
        Stack<Integer> singleStack = new Stack<>();
        singleStack.push(42);
        System.out.println("Single element before: " + singleStack);
        reverseStack(singleStack);
        System.out.println("Single element after: " + singleStack);
    }
}
