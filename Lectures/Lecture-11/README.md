# Java Exception Handling

## What are Exceptions?
Exceptions are abnormal conditions that disrupt the normal flow of program execution. In Java, exceptions are objects that wrap error events.

## Types of Exceptions:
1. Checked Exceptions - Checked at compile time

2. Unchecked Exceptions - Checked at runtime

3. Errors - System-level problems

## Custom Exceptions
Creating Custom Exception Classes
```java
// Custom exception for negative numbers
class NegNumException extends Exception{
    public NegNumException(String message){
        super(message); // Pass message to parent Exception class
    }
}

// Custom exception for age validation
class AgeException extends Exception{
    public AgeException(String message){
        super(message); // Pass message to parent Exception class
    }
}
```
## Key Points:

- Must extend Exception class (for checked exceptions) or RuntimeException (for unchecked)

- Constructor should call super(message) to set the error message

- Used for application-specific error conditions

## Exception Handling Mechanisms
1. Basic Try-Catch Block
```java
try {
    // Code that might throw exception
    String s = null;
    System.out.println(s.length()); // This will throw NullPointerException
} catch(NullPointerException e) {
    // Handle the exception
    System.out.println("Error: " + e.getMessage());
}
System.out.println("Program continues execution...");
```
### Output:

```text
Error: null
Program continues execution...
```
2. Multiple Catch Blocks
```java
try {
    int a = 10/0;                    // Throws ArithmeticException
    System.out.println(a);
    String p = null;
    System.out.println(p.length());  // Throws NullPointerException
} catch (ArithmeticException e) {
    System.out.println("Math Error: " + e.getMessage());
} catch (NullPointerException e) {
    System.out.println("Null Error: " + e.getMessage());
} catch (Exception e) {
    System.out.println("General Error: " + e.getMessage());
}
```
Output:

```text
Math Error: / by zero
Important: Order matters! Specific exceptions should come before general ones.
```
## Custom Exception Implementation
Method with Throws Declaration
```java
// Method that throws custom exception
public static void validateNumber(int n) throws NegNumException {
    if (n < 0) {
        throw new NegNumException("Negative Number " + n + " not Allowed");
    } else {
        System.out.println("Number " + n + " is valid");
    }
}

// Method for age validation
public static void checkAge(int age) throws AgeException {
    if (age < 18) {
        throw new AgeException("Age " + age + ": You are Not Eligible");
    } else {
        System.out.println("Age " + age + ": Eligible");
    }
}
```
## Using Custom Exceptions
```java
// Example 1: Negative number validation
try {
    validateNumber(-6);
} catch (NegNumException e) {
    System.out.println("Custom Exception Caught: " + e.getMessage());
}

// Example 2: Age validation
try {
    checkAge(12);
} catch (AgeException e) {
    System.out.println("Age Validation Failed: " + e.getMessage());
}

// Example 3: Valid cases
try {
    validateNumber(10);
    checkAge(20);
} catch (NegNumException | AgeException e) {
    System.out.println("Validation Error: " + e.getMessage());
}
```
### Output:

```text
Custom Exception Caught: Negative Number -6 not Allowed
Age Validation Failed: Age 12: You are Not Eligible
Number 10 is valid
Age 20: Eligible
```
## Complete Working Example
```java
public class ExceptionDemo {
    
    // Custom exception classes
    static class NegNumException extends Exception {
        public NegNumException(String message) {
            super(message);
        }
    }
    
    static class AgeException extends Exception {
        public AgeException(String message) {
            super(message);
        }
    }
    
    // Method that throws custom exception
    public static void validateNumber(int n) throws NegNumException {
        if (n < 0) {
            throw new NegNumException("❌ Negative Number " + n + " not Allowed");
        } else {
            System.out.println("✅ Number " + n + " is valid");
        }
    }
    
    // Method for age validation
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("🚫 Age " + age + ": You are Not Eligible");
        } else {
            System.out.println("✅ Age " + age + ": Eligible");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== BASIC EXCEPTION HANDLING ===");
        
        // 1. NullPointerException handling
        try {
            String s = null;
            System.out.println(s.length());
        } catch(NullPointerException e) {
            System.out.println("⚠️ Caught NullPointer: " + e.getMessage());
        }
        
        System.out.println("\n=== MULTIPLE EXCEPTION TYPES ===");
        
        // 2. Multiple exceptions
        try {
            int a = 10/0;
            String p = null;
            System.out.println(p.length());
        } catch (ArithmeticException e) {
            System.out.println("➗ Math Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("🔄 Null Error: " + e.getMessage());
        }
        
        System.out.println("\n=== CUSTOM EXCEPTIONS ===");
        
        // 3. Custom exception examples
        try {
            validateNumber(-5);
        } catch (NegNumException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        
        // 4. Valid cases
        try {
            validateNumber(42);
            checkAge(25);
        } catch (NegNumException | AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```
## Best Practices
1. Exception Handling Strategy
```java
// ✅ GOOD: Specific exception handling
try {
    // code
} catch (SpecificException e) {
    // handle specific case
} catch (GeneralException e) {
    // handle general case
}

// ❌ BAD: Catching everything with Exception
try {
    // code
} catch (Exception e) {
    // too broad - might hide bugs
}
```
2. Resource Management
```java
// Use try-with-resources for automatic cleanup
try (FileReader fr = new FileReader("file.txt")) {
    // use resource
} catch (IOException e) {
    // handle exception
}
```
3. Meaningful Messages
```java
// ✅ GOOD: Descriptive messages
throw new AgeException("User age " + age + " is below minimum requirement of 18");

// ❌ BAD: Vague messages
throw new AgeException("Invalid age");
```
## Common Exception Types

| Exception Type | When Thrown | Example |
|---------------|-------------|---------|
| `NullPointerException` | Accessing null object | `String s = null; s.length();` |
| `ArithmeticException` | Math operations | `int a = 10/0;` |
| `ArrayIndexOutOfBoundsException` | Invalid array index | `arr[10]` when `arr.length=5` |
| `IllegalArgumentException` | Invalid method argument | `Integer.parseInt("abc")` |
| `NumberFormatException` | Invalid number format | `Double.parseDouble("12.34.56")` |


## Exception Hierarchy
```text
java.lang.Object
    └── java.lang.Throwable
          ├── java.lang.Exception (Checked)
          │     ├── IOException
          │     ├── SQLException
          │     └── Custom Exceptions
          │           ├── NegNumException
          │           └── AgeException
          │
          └── java.lang.RuntimeException (Unchecked)
                ├── NullPointerException
                ├── ArithmeticException
                ├── IllegalArgumentException
                └── ArrayIndexOutOfBoundsException
```
## Key Takeaways
- Use try-catch to handle exceptions gracefully

- Create custom exceptions for business logic validation

- Order catch blocks from specific to general

- Provide meaningful error messages in custom exceptions

- Don't ignore exceptions - always handle or propagate them

- Use finally block for cleanup operations

- This comprehensive approach ensures robust error handling in Java applications!
