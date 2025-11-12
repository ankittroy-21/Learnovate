# What is a Queue?
A Queue is a linear data structure that follows the FIFO (First-In-First-Out) principle. The element that is added first will be removed first.

## Real-life Analogies:
> Ticket Counter: People standing in line

> Printer Queue: Print jobs waiting to be printed

> Customer Service: Calls waiting in a call center

# Queue Operations

| Operation | Description | Time Complexity |
|-----------|-------------|-----------------|
| enqueue/add() | Adds element to the rear | O(1) |
| dequeue/remove() | Removes element from the front | O(1) |
| peek() | Returns front element without removing | O(1) |
| isEmpty() | Checks if queue is empty | O(1) |
| size() | Returns number of elements | O(1) |

## Implementation Using Linked List
### Node Class
```java
class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}
```
### Queue Class Structure
```java
class MyQueue {
    QueueNode front, rear;
    
    public MyQueue() {
        this.front = this.rear = null;
    }
}
```
### Complete Queue Implementation
```java
class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    QueueNode front, rear;
    
    // Add element to the queue
    void add(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " added to queue");
    }

    // Remove element from the queue
    int remove() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(value + " removed from queue");
        return value;
    }

    // Peek at the front element
    int peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Get the size of queue
    int size() {
        int count = 0;
        QueueNode current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Display all elements in queue
    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
```
## Additional Queue Operations
### Enhanced Queue Implementation
```java
public class AdvancedQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        
        // Basic Operations
        System.out.println("=== BASIC QUEUE OPERATIONS ===");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.display();
        
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        
        queue.remove();
        queue.display();
        
        // Advanced Operations
        System.out.println("\n=== ADVANCED OPERATIONS ===");
        demonstrateReverseQueue();
        demonstrateFindElement();
        demonstrateQueueWithStrings();
    }
    
    // Reverse a queue
    public static void demonstrateReverseQueue() {
        System.out.println("Reversing a Queue:");
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        System.out.print("Original: ");
        queue.display();
        
        // Reverse using stack
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        
        System.out.print("Reversed: ");
        queue.display();
    }
    
    // Find element in queue
    public static void demonstrateFindElement() {
        System.out.println("\nFinding element in Queue:");
        MyQueue queue = new MyQueue();
        queue.add(5);
        queue.add(15);
        queue.add(25);
        queue.add(35);
        
        int target = 25;
        boolean found = false;
        QueueNode current = queue.front;
        int position = 1;
        
        while (current != null) {
            if (current.data == target) {
                found = true;
                break;
            }
            current = current.next;
            position++;
        }
        
        if (found) {
            System.out.println("Element " + target + " found at position: " + position);
        } else {
            System.out.println("Element " + target + " not found in queue");
        }
    }
    
    // Queue with different data types
    public static void demonstrateQueueWithStrings() {
        System.out.println("\nString Queue Implementation:");
        StringQueue stringQueue = new StringQueue();
        stringQueue.add("Alice");
        stringQueue.add("Bob");
        stringQueue.add("Charlie");
        stringQueue.display();
        
        stringQueue.remove();
        stringQueue.display();
    }
}

// Generic String Queue Implementation
class StringNode {
    String data;
    StringNode next;
    
    public StringNode(String data) {
        this.data = data;
        this.next = null;
    }
}

class StringQueue {
    StringNode front, rear;
    
    void add(String data) {
        StringNode newNode = new StringNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    String remove() {
        if (front == null) {
            return null;
        }
        String value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }
    
    void display() {
        System.out.print("String Queue: ");
        StringNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
```
## Real-world Applications
### 1. Breadth-First Search (BFS)
```java
public class BFSExample {
    public static void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        MyQueue queue = new MyQueue();
        
        visited[start] = true;
        queue.add(start);
        
        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            int current = queue.remove();
            System.out.print(current + " ");
            
            for (int i = 0; i < graph[current].length; i++) {
                if (graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {0, 0, 1, 0}
        };
        
        bfs(graph, 0);
    }
}
```
### 2. Task Scheduler
```java
class Task {
    String name;
    int priority;
    
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

class TaskScheduler {
    MyQueue taskQueue = new MyQueue();
    
    void addTask(Task task) {
        // Implementation for task scheduling
        System.out.println("Added: " + task);
    }
    
    void processTasks() {
        System.out.println("Processing tasks...");
        while (!taskQueue.isEmpty()) {
            // Process tasks in FIFO order
        }
    }
}
```
## Types of Queues
### 1. Simple Queue (FIFO)
- Basic queue we implemented

- Elements added at rear, removed from front

### 2. Circular Queue
- Fixed size array implementation

- Reuses empty spaces

### 3. Priority Queue
- Elements processed based on priority

- Higher priority elements served first

### 4. Double Ended Queue (Deque)
- Elements can be added/removed from both ends

## Complete Example with All Features
```java
public class QueueExample {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        
        // Test basic functionality
        System.out.println("=== QUEUE DEMONSTRATION ===");
        
        q.add(34);
        q.add(45);
        q.add(56);
        q.display();
        
        System.out.println("Front element: " + q.peek());
        System.out.println("Queue size: " + q.size());
        
        q.remove();
        q.display();
        
        q.add(67);
        q.add(78);
        q.display();
        
        // Test edge cases
        System.out.println("\n=== EDGE CASES ===");
        MyQueue emptyQueue = new MyQueue();
        System.out.println("Is empty queue empty? " + emptyQueue.isEmpty());
        emptyQueue.remove(); // Should show "Queue is Empty"
        System.out.println("Peek on empty queue: " + emptyQueue.peek());
    }
}
```
## Key Points to Remember
1. FIFO Principle: First In, First Out

2. Time Complexity: All basic operations are O(1)

3. Space Complexity: O(n) where n is number of elements

4. Use Cases: BFS, task scheduling, resource management

5. Implementation Choices: Array (fixed size) or Linked List (dynamic)
