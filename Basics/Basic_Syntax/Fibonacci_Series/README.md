# Fibonacci Series
## What is Fibonacci Series?
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

## Mathematical Definition:
```text
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) for n ≥ 2
```
### First 10 Fibonacci Numbers:
```text
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
```
# Key Concepts
## 1. Recursive Approach
Idea: Solve problem by solving smaller instances of the same problem

- Base Case: F(0) = 0, F(1) = 1

- Recursive Case: F(n) = F(n-1) + F(n-2)

## 2. Iterative Approach
- Idea: Use loops to calculate sequentially

- More efficient than recursive approach

- Time Complexity: O(n) vs Recursive O(2^n)

## Java Implementation
### Method 1: Iterative Approach (Recommended)
```java
public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        int first = 0, second = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            
            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
```
### Output:

```text
Fibonacci series up to 10 terms:
0 1 1 2 3 5 8 13 21 34
```
### Method 2: Recursive Approach
```java
public class FibonacciRecursive {
    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
```
### Output:

```text
Fibonacci series up to 10 terms:
0 1 1 2 3 5 8 13 21 34
```
### Method 3: Using Array (Store Results)
```java
public class FibonacciArray {
    public static void main(String[] args) {
        int n = 10;
        int[] fib = new int[n];
        
        // Base cases
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }
        
        // Calculate remaining terms
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int num : fib) {
            System.out.print(num + " ");
        }
    }
}
```
##  Performance Comparison

| Method | Time Complexity | Space Complexity | Best For |
|--------|-----------------|------------------|----------|
| Iterative | O(n) | O(1) | Large values of n |
| Recursive | O(2^n) | O(n) | Small values, learning |
| Array-based | O(n) | O(n) | When you need all terms |

---

##  Step-by-Step Example (Iterative)

Let's trace **n = 5**:

| Step | i | first | second | next | Output |
|------|---|-------|--------|------|---------|
| 1 | 1 | 0 | 1 | 1 | 0 |
| 2 | 2 | 1 | 1 | 2 | 1 |
| 3 | 3 | 1 | 2 | 3 | 1 |
| 4 | 4 | 2 | 3 | 5 | 2 |
| 5 | 5 | 3 | 5 | 8 | 3 |

**Final Output:** 0 1 1 2 3


## Important Points to Remember
- Base Cases: Always handle n=0 and n=1 separately

- Integer Overflow: For large n, use long or BigInteger

- Efficiency: Iterative approach is always better for Fibonacci

- Negative Numbers: Fibonacci is defined only for non-negative integers

## Enhanced Version (Handles Large Numbers)
```java
public class FibonacciLarge {
    public static void main(String[] args) {
        int n = 50;
        long first = 0, second = 1;
        
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + first);
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
```
## Memoization Example:
```java
import java.util.Arrays;

public class FibonacciMemoization {
    private static long[] memo;
    
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
    
    public static void main(String[] args) {
        int n = 50;
        memo = new long[n + 1];
        Arrays.fill(memo, -1);
        
        System.out.println("F(" + n + ") = " + fibonacci(n));
    }
}
```
## Key Takeaways
> Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

- Best Approach: Iterative method (most efficient)

- Learning Tool: Recursive method (good for understanding recursion)

- Real-world Use: Algorithms, financial modeling, nature patterns
