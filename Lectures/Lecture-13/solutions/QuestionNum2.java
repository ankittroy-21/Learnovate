import java.util.Stack;

public class QuestionNum2 {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
    }
}

class QueueUsingStacks {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;
    
    public QueueUsingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    public void enqueue(int x) {
        inputStack.push(x);
    }
    
    public int dequeue() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.isEmpty() ? -1 : outputStack.pop();
    }
    
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.isEmpty() ? -1 : outputStack.peek();
    }
    
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
