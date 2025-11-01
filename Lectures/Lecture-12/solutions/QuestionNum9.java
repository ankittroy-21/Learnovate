import java.util.Stack;

public class QuestionNum9 {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;
    
    public QuestionNum9() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
        System.out.println("Pushed: " + value);
    }
    
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = stack.pop();
        if (value == maxStack.peek()) {
            maxStack.pop();
        }
        System.out.println("Popped: " + value);
        return value;
    }
    
    public int getMax() {
        if (maxStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return maxStack.peek();
    }
    
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack.peek();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        QuestionNum9 maxStack = new QuestionNum9();
        
        maxStack.push(3);
        System.out.println("Current Max: " + maxStack.getMax());
        
        maxStack.push(5);
        System.out.println("Current Max: " + maxStack.getMax());
        
        maxStack.push(2);
        System.out.println("Current Max: " + maxStack.getMax());
        
        maxStack.push(8);
        System.out.println("Current Max: " + maxStack.getMax());
        
        maxStack.pop();
        System.out.println("Current Max after pop: " + maxStack.getMax());
        
        maxStack.pop();
        maxStack.pop();
        System.out.println("Current Max after pops: " + maxStack.getMax());
    }
}
