# What is Java?
Java is a high-level, object-oriented, platform-independent programming language
developed by **Sun Microsystems in 1995 (now owned by Oracle)**. It follows the
WORA principle — “Write Once, Run Anywhere”.
<br>
<br>
 > ## Reference to 
[Solution of Question No. 1](https://github.com/ankittroy-21/Learnovate/blob/main/Lecture-1/solutions/HelloJava.java)
<br>
| Line | Explanation |
|---|---|
| `public class HelloJava` | Declares a class named **HelloJava**. In Java, all code must be inside a class. |
| `{` | Opening brace marks the beginning of the class body. |
| `public static void main(String[] args)` | The **main method** – it's the entry point of every Java program. |
| `public` | Makes the method accessible from anywhere. |
| `static` | Means the method can run without creating an object of the class. |
| `void` | Indicates the method doesn't return any value. |
| `String[] args` | Used to accept command-line arguments. |
| `System.out.println("Hello, Java!");` | Prints the text on the screen. **System.out** is the standard output stream. |
| `}` | Closing braces end the main method and class body. |
<br>

# Java Terminologies

- **JDK (Java Development Kit)** - Tools for developing Java applications (includes JRE +
compiler)
- **JRE (Java Runtime Environment)** - Required to run Java applications (includes JVM +
libraries)<br>
- **JVM (Java Virtual Machine)** - Runs the Java bytecode, making Java platformindependent<br>
- **Bytecode** - Intermediate code generated after compilation (understood by JVM)
  
## To Print Anything We Can Use Print Methods

`System.out.print("Text you want to print");`

`System.out.println("Prints new line after text");`

`System.out.print(456);`

`System.out.println(7+21);`

## Comments
- **Single-line Comments :**
Single-line comments start with two forward slashes (//).
Any text between // and the end of the line is ignored by Java (will not be executed).
```java
// This is a comment
System.out.println("Learn Java");
```
- **Multi-line Comments :**
Multi-line comments start with /* and ends with */.
Any text between /* and */ will be ignored by Java.
```java
/* The code below will print the words Hello World
to the screen, and it is amazing */
System.out.println("Comments make code more readable");
```
