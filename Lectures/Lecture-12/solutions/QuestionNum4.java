import java.util.Stack;

public class QuestionNum4 {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    
    public QuestionNum4() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        mainStack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
        System.out.println("Pushed: " + value);
    }
    
    public int pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = mainStack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
        System.out.println("Popped: " + value);
        return value;
    }
    
    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return minStack.peek();
    }
    
    public int peek() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return mainStack.peek();
    }
    
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
    
    public static void main(String[] args) {
        QuestionNum4 specialStack = new QuestionNum4();
        
        specialStack.push(5);
        System.out.println("Minimum: " + specialStack.getMin());
        
        specialStack.push(3);
        System.out.println("Minimum: " + specialStack.getMin());
        
        specialStack.push(7);
        System.out.println("Minimum: " + specialStack.getMin());
        
        specialStack.push(2);
        System.out.println("Minimum: " + specialStack.getMin());
        
        specialStack.pop();
        System.out.println("Minimum after pop: " + specialStack.getMin());
        
        specialStack.pop();
        specialStack.pop();
        System.out.println("Minimum after pops: " + specialStack.getMin());
    }
}
