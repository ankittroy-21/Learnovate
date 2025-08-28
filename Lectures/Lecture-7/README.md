# Java Methods
### What are Methods? 

**Methods** are like little helpers in your code that do specific jobs. Think of them as mini-programs inside your main program that you can use over and over again!

### Why Use Methods?
- **Reuse code**: Write once, use many times
- **Stay organized**: Break big problems into small pieces
- **Easy to fix**: Find and fix errors quickly
- **Teamwork**: Different people can work on different methods

### Basic Method Structure

```java
public static void sayHello() {
    System.out.println("Hello World! ");
}
```
### Example Explained

| Part | What it does | Example |
|------|-------------|---------|
| `public` | Makes the method accessible from other classes | `public void myMethod()` |
| `private` | Makes the method accessible only within its own class | `private void myMethod()` |
| `protected` | Makes the method accessible within the same package and subclasses | `protected void myMethod()` |
| `static` | Allows the method to be called without creating an object of the class | `static void myMethod()` |
| `void` | Specifies that the method does not return any value | `void printMessage()` |
| `returnType` | Specifies the type of value the method returns (e.g., int, String, double) | `int calculateSum()` |
| `methodName` | The name used to call the method (should be a verb) | `calculateTotal()` |
| `()` | Contains parameters that the method accepts | `(int a, int b)` |
| `parameters` | Input values that the method needs to work | `(String name, int age)` |
| `{}` | Contains the actual code that the method executes | `{ System.out.println("Hello"); }` |
| `return` | Statement used to return a value from the method | `return result;` |

### Step 1: Understand the Basic Structure
A method has three main parts:
1. **Method Declaration** - The method's "ID card"
2. **Method Body** - The actual instructions
3. **Method Call** - Using the method in your program

### Step 2: Method Declaration
This is where you define the method's basic information:

```java
public static void methodName() {
    // This is the method declaration
}
```
### Step 3: Method Body
This is where you write what the method actually does:
```java
public static void greet() {
    // Method body starts here
    System.out.println("Hello!");
    System.out.println("Welcome to Java!");
    // Method body ends here
}
```
### Step 4: Method Call
This is how you use the method in your program:
```java
public class Main {
    public static void main(String[] args) {
        greet();  // This is the method call
    }
    
    public static void greet() {
        System.out.println("Hello!");
    }
}
```

### Using the Method:
```java
public class Main {
    public static void main(String[] args) {
        
        // Step 3: Call the method
        printMessage();  // This executes the method
        
        System.out.println("Back in main method");
        
        // You can call it multiple times
        printMessage();  // Calls it again
    }
    
    public static void printMessage() {
        System.out.println("This is my first method!");
        System.out.println("It prints two lines of text.");
    }
}
```

## Key Rules to Remember
- Method Names should be descriptive verbs (printMessage, calculateSum, getUserInput)

- Method Declaration must include return type (void if no return)

- Method Body goes inside curly braces {}

- Method Call uses the exact same name followed by ()

- Order Matters - Methods must be defined before or after main, but calls must be after definition

---

# Types of Methods

### Predefined Methods 
These are ready-made methods that Java provides for you! You don't need to create them - just use them.

**Examples:**
```java
// Math operations
Math.sqrt(25);        // Returns square root of 25 → 5.0
Math.max(10, 20);     // Returns larger number → 20

// String operations
"Hello".length();     // Returns length of string → 5
"Java".toUpperCase(); // Converts to uppercase → "JAVA"

// Output
System.out.println(); // Prints to console
```
### User-defined Methods 

These are methods that **YOU create**! You decide what they do and how they work.

**Example:**
```java
// Creating your own method
public static void greet() {
    System.out.println("Hello! Welcome to Java! ");
}

// Using your method
greet(); // Calls your custom method
```
## Based on Parameters
### Parameterized Methods 
These methods accept input values (called parameters) to work with.

#### Example:
```java
// Method that accepts parameters
public static void sayHello(String name, int age) {
    System.out.println("Hello " + name + "! You are " + age + " years old.");
}

// Using with inputs
sayHello("Alice", 25); // Output: Hello Alice! You are 25 years old.
```
## Types of Parameterized
### 1.Methods with Parameters but without Return Value
These methods take input parameters but don't return any value.
```java
public static void greetUser(String userName) {
    System.out.println("Hello, " + userName + "! Nice to meet you.");
}

// Usage
greetUser("John");
```

### 2. Methods with Parameters and with Return Value
These methods take input parameters and return a value.
```java
public static int calculateSum(int num1, int num2) {
    int result = num1 + num2;
    return result;
}

// Usage
int total = calculateSum(5, 3);
System.out.println("Sum: " + total);
```


### Non-Parameterized Methods 
These methods don't need any inputs - they work on their own!

#### Example:
```java
// Method without parameters
public static void displayTime() {
    System.out.println("Current time: " + java.time.LocalTime.now());
}

// Usage
displayTime(); // Output: Current time: 14:30:45
```
## Types of Non-Parameterized 
### 1. Methods without Parameters and without Return Value
These methods perform an action but don't take input or return output.

```java
public static void printWelcome() {
    System.out.println("Welcome to Java Programming!");
    System.out.println("Enjoy learning!");
}

// Usage
printWelcome();
```
### 2. Methods without Parameters but with Return Value
These methods don't take input but return a value.
```java
public static int generateRandomNumber() {
    return (int)(Math.random() * 100);
}

// Usage
int randomValue = generateRandomNumber();
```
### Real-life Analogy

Think of methods like a **kitchen recipe**:

| Method Type | Kitchen Analogy | Description |
|-------------|-----------------|-------------|
| **Non-parameterized** | Making toast | Always works the same way, no ingredients needed |
| **Parameterized** | Making sandwiches | Needs specific ingredients as input parameters |
| **With return** | Baking a cake | Produces a result you get back (the cake) |
| **Without return** | Washing dishes | Work is done, but nothing is returned |
