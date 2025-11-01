public class QuestionNum8 {
    private int[] arr;
    private int top1, top2;
    private int capacity;
    
    public QuestionNum8(int size) {
        capacity = size;
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }
    
    public void push1(int value) {
        if (top1 < top2 - 1) {
            arr[++top1] = value;
            System.out.println("Pushed to stack1: " + value);
        } else {
            System.out.println("Stack1 Overflow!");
        }
    }
    
    public void push2(int value) {
        if (top1 < top2 - 1) {
            arr[--top2] = value;
            System.out.println("Pushed to stack2: " + value);
        } else {
            System.out.println("Stack2 Overflow!");
        }
    }
    
    public int pop1() {
        if (top1 >= 0) {
            int value = arr[top1--];
            System.out.println("Popped from stack1: " + value);
            return value;
        } else {
            System.out.println("Stack1 Underflow!");
            return -1;
        }
    }
    
    public int pop2() {
        if (top2 < capacity) {
            int value = arr[top2++];
            System.out.println("Popped from stack2: " + value);
            return value;
        } else {
            System.out.println("Stack2 Underflow!");
            return -1;
        }
    }
    
    public void display() {
        System.out.print("Stack1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nStack2: ");
        for (int i = capacity - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        QuestionNum8 twoStacks = new QuestionNum8(6);
        
        twoStacks.push1(10);
        twoStacks.push2(20);
        twoStacks.push1(30);
        twoStacks.push2(40);
        twoStacks.push1(50);
        twoStacks.push2(60);
        
        twoStacks.display();
        
        twoStacks.pop1();
        twoStacks.pop2();
        twoStacks.display();
        
        twoStacks.push1(70);
        twoStacks.push2(80);
        twoStacks.display();
    }
}
