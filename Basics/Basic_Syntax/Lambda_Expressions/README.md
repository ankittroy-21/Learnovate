# Lambda Expressions in Java

## What are Lambda Expressions?

**Lambda expressions** are a feature introduced in Java 8 that allow you to write concise anonymous functions (methods without a name). They provide a clear and concise way to represent one method interface using an expression.

## Why Use Lambda Expressions?

- **Concise Code**: Reduces boilerplate code
- **Functional Programming**: Enables functional programming style
- **Readability**: Makes code more readable and maintainable
- **Parallel Processing**: Facilitates parallel processing

---

## Basic Syntax

```java
(parameters) -> expression
```
or
```java
(parameters) -> { statements; }
```
## Lambda Expression Components

| Component | Description | Example |
|-----------|-------------|---------|
| **Parameters** | Input arguments for the lambda expression. Can be zero, one, or multiple parameters. | `(int a, int b)` |
| **Arrow Token (->)** | Separates the parameters from the body of the expression. | `->` |
| **Body** | The code to be executed. Can be a single expression or a code block. | `a + b` or `{ return a + b; }` |

## Comparison: Traditional vs Lambda Approach
### Traditional Approach (Anonymous Class)
```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
};
```
### Lambda Approach
```java
Runnable r = () -> System.out.println("Hello World");
```
### Types of Lambda Expressions
**1. No Parameters**
```java
() -> System.out.println("No parameters");
```
**2. Single Parameter**
```java
(name) -> System.out.println("Hello " + name);
```
**3. Multiple Parameters**
```java
(a, b) -> a + b;
```
**4. With Return Statement**
```java
(a, b) -> { return a + b; };
```
**5. With Multiple Statements**
```java
(a, b) -> {
    int sum = a + b;
    return sum;
};
```
## Functional Interfaces
Lambda expressions work with functional interfaces - interfaces with only one abstract method.
### Common Functional Interfaces for Lambda Expressions

| Interface | Description | Method Signature | Lambda Example |
|-----------|-------------|------------------|----------------|
| **Runnable** | Represents a task that takes no arguments and returns no result. | `void run()` | `() -> System.out.println("Hello")` |
| **Consumer<T>** | Accepts a single input argument and returns no result. | `void accept(T t)` | `(x) -> System.out.println(x)` |
| **Supplier<T>** | Supplies a result without taking any input. | `T get()` | `() -> "Hello World"` |
| **Function<T,R>** | Accepts one argument and produces a result. | `R apply(T t)` | `(x) -> x * 2` |
| **Predicate<T>** | Tests a condition and returns a boolean value. | `boolean test(T t)` | `(x) -> x > 0` |
| **Comparator<T>** | Compares two objects of the same type. | `int compare(T o1, T o2)` | `(a, b) -> a.compareTo(b)` |
| **BinaryOperator<T>** | Operates on two operands of the same type and returns a result of the same type. | `T apply(T t1, T t2)` | `(a, b) -> a + b` |

## Practical Examples
**Example 1: Using Runnable**
```java
// Traditional
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("Thread running");
    }
}).start();

// Lambda
new Thread(() -> System.out.println("Thread running")).start();
```
**Example 2: Using Comparator**
```java
List<String> names = Arrays.asList("John", "Alice", "Bob");

// Traditional
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
});

// Lambda
Collections.sort(names, (a, b) -> a.compareTo(b));
```
**Example 3: Using forEach with Consumer**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Traditional
numbers.forEach(new Consumer<Integer>() {
    @Override
    public void accept(Integer n) {
        System.out.println(n);
    }
});

// Lambda
numbers.forEach(n -> System.out.println(n));
```
## Benefits of Lambda Expressions
1. Reduced Lines of Code: Eliminates boilerplate code

2. Improved Readability: More concise and expressive

3. Enhanced Collections: Better support for collection operations

4. Parallel Processing: Easier to write parallel code

5. Functional Programming: Supports functional programming paradigm

## Limitations
1. Only with Functional Interfaces: Can only be used with interfaces having single abstract method

2. No Instance Variables: Cannot declare instance variables

3. Limited Exception Handling: Checked exceptions must be handled within lambda body

## Best Practices
* Keep Lambdas Short: Preferably single line expressions

* Use Method References: When possible, use Class::method syntax

* Avoid Complex Logic: Move complex logic to separate methods

* Use Descriptive Parameters: Meaningful parameter names improve readability

## Common Use Cases
- Event Listeners: Button click handlers in GUI applications

- Thread Operations: Simple Runnable implementations

- Collection Processing: Filtering, mapping, and reducing collections

- Stream API: Processing streams of data

- Comparator Implementation: Sorting collections

