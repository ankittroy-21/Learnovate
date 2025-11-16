public class QuestionNum6 {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        System.out.println(cq.enQueue(1)); // true
        System.out.println(cq.enQueue(2)); // true
        System.out.println(cq.enQueue(3)); // true
        System.out.println(cq.enQueue(4)); // false
        System.out.println(cq.Rear()); // 3
        System.out.println(cq.isFull()); // true
        System.out.println(cq.deQueue()); // true
        System.out.println(cq.enQueue(4)); // true
        System.out.println(cq.Rear()); // 4
    }
}

class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    public CircularQueue(int k) {
        capacity = k;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : arr[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}
