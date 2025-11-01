public class QuestionNum1 {
    private int[] stack;
    private int top;
    private final int capacity;
    
    public QuestionNum1(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        int value = stack[top--];
        System.out.println("Popped: " + value);
        return value;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek");
            return -1;
        }
        return stack[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        QuestionNum1 stack = new QuestionNum1(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        
        System.out.println("Top element: " + stack.peek());
        
        stack.pop();
        stack.display();
        
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); // This will cause overflow
        stack.display();
        
        while (!stack.isEmpty()) {
            stack.pop();
        }
        stack.pop(); // This will cause underflow
    }
}
