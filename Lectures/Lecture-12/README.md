# Stack 
## Introduction to Stack
A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) principle. This means the last element added to the stack will be the first one to be removed. Think of it like a stack of plates - you can only add or remove plates from the top.

## Real-life Analogies:
- **Stack of Books:** You can only add or remove books from the top

- **Browser Back Button:** The most recently visited page is the first to go back to

- **Undo Functionality:** The last action is the first to be undone

- **Function Call Stack:** In programming, function calls are managed using stacks

## Stack Principles and Terminology
### Basic Terminology:
> Top: The uppermost element of the stack

> Push: Operation to add an element to the top

> Pop: Operation to remove an element from the top

> Peek/Top: Operation to view the top element without removing it

> Underflow: Condition when trying to pop from an empty stack

> Overflow: Condition when trying to push to a full stack (in fixed-size implementation)

## Stack Visualization:
```text
Operations:        Stack State:
Initial           [Empty]
push(10)          [10]
push(20)          [20, 10]
push(30)          [30, 20, 10]
peek() → 30       [30, 20, 10]
pop() → 30        [20, 10]
pop() → 20        [10]
pop() → 10        [Empty]
```
## Stack Implementation Methods
*There are three main ways to implement a stack in Java:*

- Using Built-in Stack Class `(Easiest, most commonly used)`

- Using Array `(Fixed size, memory efficient)`

- Using Linked List `(Dynamic size, more flexible)`

## Built-in Stack Class
Java provides a built-in Stack class in java.util package that implements all stack operations.

### Complete Example with Built-in Stack:
```java
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        // Display the stack
        System.out.println("Initial Stack: " + stack);
        
        // Peek - view top element without removal
        System.out.println("Top Element: " + stack.peek());
        
        // Pop - remove and return top element
        int removedElement = stack.pop();
        System.out.println("Popped Element: " + removedElement);
        System.out.println("Stack after pop: " + stack);
        
        // Search for an element (returns position from top, 1-based)
        int position = stack.search(20);
        System.out.println("Position of 20: " + position);
        
        // Check if stack is empty
        System.out.println("Is Empty? " + stack.isEmpty());
        
        // Get stack size
        System.out.println("Stack Size: " + stack.size());
        
        // Iterate through stack (without popping)
        System.out.println("Stack elements from top to bottom:");
        for (Integer element : stack) {
            System.out.println(element);
        }
    }
}
```
### Output:

```text
Initial Stack: [10, 20, 30, 40]
Top Element: 40
Popped Element: 40
Stack after pop: [10, 20, 30]
Position of 20: 2
Is Empty? false
Stack Size: 3
Stack elements from top to bottom:
10
20
30
```
## All Built-in Stack Methods:
```java
import java.util.Stack;

public class StackMethodsDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // 1. push() - Add element to top
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("After push: " + stack);
        
        // 2. pop() - Remove and return top element
        String top = stack.pop();
        System.out.println("Popped: " + top);
        System.out.println("After pop: " + stack);
        
        // 3. peek() - View top element without removal
        String currentTop = stack.peek();
        System.out.println("Current top: " + currentTop);
        
        // 4. empty() - Check if stack is empty
        System.out.println("Is empty? " + stack.empty());
        
        // 5. search() - Find position of element (1-based from top)
        int position = stack.search("Java");
        System.out.println("Position of 'Java': " + position);
        
        // 6. size() - Get number of elements
        System.out.println("Size: " + stack.size());
        
        // 7. clear() - Remove all elements
        stack.clear();
        System.out.println("After clear: " + stack);
        System.out.println("Is empty now? " + stack.empty());
    }
}
```
## Custom Stack Implementations
### 1. Array-Based Stack Implementation
```java
public class ArrayStack {
    private int[] stackArray;
    private int top;
    private int capacity;
    
    // Constructor
    public ArrayStack(int size) {
        this.capacity = size;
        this.stackArray = new int[capacity];
        this.top = -1; // Stack is initially empty
    }
    
    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }
    
    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        int value = stackArray[top--];
        System.out.println("Popped: " + value);
        return value;
    }
    
    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    
    // Main method to test
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        
        System.out.println("Top element: " + stack.peek());
        
        stack.pop();
        stack.display();
        
        stack.push(40);
        stack.push(50);
        stack.push(60); // This will cause overflow
        stack.display();
    }
}
```
## 2. Linked List-Based Stack Implementation
```java
// Node class for linked list
class StackNode {
    int data;
    StackNode next;
    
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using linked list
class MyStack {
    StackNode top;
    
    // Push operation - Add to beginning
    void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Pushed: " + data);
    }
    
    // Pop operation - Remove from beginning
    int pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        System.out.println("Popped: " + value);
        return value;
    }
    
    // Peek operation - View top without removal
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }
    
    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }
    
    // Display stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        StackNode current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to test linked list stack
public class Basic_stack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        
        st.push(20);
        st.push(24);
        st.push(30);
        st.display();
        
        System.out.println("Top element: " + st.peek());
        st.pop();
        System.out.println("Top after pop: " + st.peek());
        System.out.println("Is empty? " + st.isEmpty());
        st.display();
    }
}
```
## Linked List Stack Visualization:

```text
Initial: top = null

push(20):
top → [20] → null

push(24):
top → [24] → [20] → null

push(30):
top → [30] → [24] → [20] → null

pop():
top → [24] → [20] → null
```
## Balanced Parentheses Problem
### Problem Statement:
> Given a string containing parentheses (), curly braces {}, and square brackets [], determine if the string has balanced parentheses.

### Solution using Stack:
```java
import java.util.*;

public class Balanced_Para {
    
    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        
        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } 
            // If it's a closing bracket
            else if (ch == ']' || ch == '}' || ch == ')') {
                // If stack is empty, no matching opening bracket
                if (st.isEmpty()) {
                    return false;
                }
                
                // Pop the top and check if it matches
                char top = st.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets are balanced
        return st.isEmpty();
    }
    
    // Helper method to check if brackets match
    static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
    
    // Enhanced version with detailed output
    static void checkBalanceWithDetails(String str) {
        System.out.println("Checking: " + str);
        boolean result = isBalanced(str);
        
        if (result) {
            System.out.println("✓ BALANCED - All parentheses are properly matched!");
        } else {
            System.out.println("✗ NOT BALANCED - Parentheses are mismatched!");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Test cases
        checkBalanceWithDetails("({[]})");      // Balanced
        checkBalanceWithDetails("({[}])");      // Not balanced
        checkBalanceWithDetails("((()))");      // Balanced  
        checkBalanceWithDetails("({)}");        // Not balanced
        checkBalanceWithDetails("");            // Balanced (empty string)
        checkBalanceWithDetails("Hello{World}");// Balanced (ignores non-bracket chars)
        
        // Interactive version
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Parentheses to Check: ");
        String userInput = sc.nextLine();
        checkBalanceWithDetails(userInput);
        sc.close();
    }
}
```
### Step-by-step Execution for "({[]})":
> Step	Character	Stack State	Action
1.	(	[ ( ]	Push (
2.	{	[ (, { ]	Push {
3.	[	[ (, {, [ ]	Push [
4.	]	[ (, { ]	Pop [ - matches ✓
5.	}	[ ( ]	Pop { - matches ✓
6.	)	[ ]	Pop ( - matches ✓
7.	End	[ ]	Stack empty → Balanced ✓
## Stack Applications
### 1. Expression Evaluation
```java
import java.util.Stack;

public class ExpressionEvaluation {
    
    // Evaluate postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
    
    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String postfix = "5 3 + 2 *"; // (5+3)*2 = 16
        System.out.println("Postfix: " + postfix);
        System.out.println("Result: " + evaluatePostfix(postfix));
    }
}
```
### 2. Browser History Management
```java
import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;
    
    public BrowserHistory() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = "Home";
    }
    
    public void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear(); // Clear forward history when visiting new page
        System.out.println("Visited: " + url);
    }
    
    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("Cannot go back!");
        }
    }
    
    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("Cannot go forward!");
        }
    }
    
    public void displayCurrent() {
        System.out.println("Current Page: " + currentPage);
    }
    
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");
        
        browser.back();
        browser.back();
        browser.forward();
        browser.displayCurrent();
    }
}
```
## Time and Space Complexity

### Time Complexity

| Operation     | Array Stack | Linked List Stack | Built-in Stack |
|---------------|-------------|-------------------|----------------|
| push()        | O(1)        | O(1)              | O(1)           |
| pop()         | O(1)        | O(1)              | O(1)           |
| peek()        | O(1)        | O(1)              | O(1)           |
| isEmpty()     | O(1)        | O(1)              | O(1)           |
| search()      | O(n)        | O(n)              | O(n)           |

### Space Complexity:
- Array Stack: **O(n)** where n is capacity

- Linked List Stack: **O(n)** where n is number of elements

- Built-in Stack: **O(n)** where n is number of elements

## Practice Problems
### Problem 1: Reverse a String using Stack
```java
import java.util.Stack;

public class StringReversal {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        
        // Push all characters to stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        
        // Pop characters to get reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
```
### Problem 2: Next Greater Element
```java
import java.util.Stack;

public class NextGreaterElement {
    public static void printNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        
        // Initialize result array with -1
        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;
        }
        
        // Process elements
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        
        // Print results
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " --> " + result[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        printNextGreater(arr);
    }
}
```
### Key Points Summary
- LIFO Principle: Last In, First Out - fundamental stack characteristic

- Basic Operations: `push`, `pop`, `peek`, `isEmpty` - all **O(1)** time complexity

**Implementation Choices:**

- **Array:** Fixed size, memory efficient but limited

- **Linked List:** Dynamic size, flexible but more memory overhead

- **Built-in:** Easiest to use, most practical for general purposes

**Common Applications:**

> Function call management

> Expression evaluation and conversion

> Backtracking algorithms

> Undo/Redo functionality

> Syntax checking (parentheses balancing)

**Error Conditions:**

- **Stack Underflow:** Trying to pop from empty stack

- **Stack Overflow:** Trying to push to full stack (array implementation)
