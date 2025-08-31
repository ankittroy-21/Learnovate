# BufferedReader 

## What is BufferedReader?

**BufferedReader** is a Java class that reads text from a character input stream efficiently. It buffers characters to provide smooth reading of characters, arrays, and lines.

## Why Use BufferedReader?

- **Efficient Reading**: Reads data in chunks (buffers)
- **Faster Performance**: Better than Scanner for large inputs
- **Line-by-Line Reading**: Easy to read entire lines
- **Memory Efficient**: Uses buffer to reduce I/O operations

---

## How to Use BufferedReader

### Step 1: Import Required Classes
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
```
### Step 2: Basic Syntax
```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
```
### Step 3: Reading Different Types of Input
Reading a String
```java
String name = reader.readLine();
```
Reading an Integer
```java
int number = Integer.parseInt(reader.readLine());
```
Reading a Double
```java
double decimal = Double.parseDouble(reader.readLine());
```
--- 

# Key Methods of BufferedReader

| Method | Description | Example |
|--------|-------------|---------|
| `read()` | Reads a single character and returns it as an integer (ASCII value) | `int charValue = reader.read();` |
| `readLine()` | Reads a complete line of text and returns it as a String | `String line = reader.readLine();` |
| `close()` | Closes the stream and releases any system resources associated with it | `reader.close();` |
| `ready()` | Checks if the stream is ready to be read | `if(reader.ready()) { String data = reader.readLine(); }` |
| `skip(long n)` | Skips over and discards n characters of data from this stream | `reader.skip(5); // Skips 5 characters` |

---

## Handling IOException
Always handle or declare IOException when using BufferedReader:

### Method 1: Using throws declaration
```java
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // your code here
}
```
### Method 2: Using try-catch block
```java
public static void main(String[] args) {
    try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // your code here
    } catch (IOException e) {
        System.out.println("Error reading input: " + e.getMessage());
    }
}
```
---

### Complete Example Program
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader object
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading different types of input
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());
        
        System.out.print("Enter your height (in meters): ");
        double height = Double.parseDouble(reader.readLine());
        
        // Display the input
        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        
        // Close the reader
        reader.close();
    }
}
```

## BufferedReader vs Scanner Comparison

| Feature | BufferedReader | Scanner |
|---------|---------------|---------|
| **Speed** | Faster (uses buffering) | Slower (no buffering) |
| **Buffer Size** | Larger buffer `(8KB)` | Smaller buffer `(1KB)` |
| **Reading Methods** | Basic methods: `read()`, `readLine()` | Various methods: `nextInt()`, `nextDouble()`, `nextLine()` |
| **Exception Handling** | Throws checked IOException (must be handled) | Throws unchecked InputMismatchException |
| **Parsing Capability** | No built-in parsing - need to manually parse strings | Automatic parsing of primitive types |
| **Memory Efficiency** | More memory efficient for large inputs | Less memory efficient |
| **Thread Safety** | Not thread-safe | Not thread-safe |
| **Use Case** | Best for reading large files and efficient input | Best for simple input and formatted parsing |
| **Syntax Complexity** | Requires more setup and manual parsing | Simpler syntax for direct input |
| **Reading Files** | Excellent for reading large text files | Good for small to medium files |


## Best Practices
- Always close the reader using `close()` method

- Handle IOException properly

- Use try-with-resources for automatic closing

- Parse carefully when converting strings to numbers

### Try-with-resources Example:
```java
try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
    String input = reader.readLine();
    // automatically closed after try block
}
```
## Common Errors and Solutions
- Forgetting to import classes → Add required imports

- Not handling IOException → Use throws or try-catch

- Number format exceptions → Validate input before parsing

- Not closing the reader → Use `close()` or try-with-resources
