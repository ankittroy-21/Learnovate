
# Explanation ( To take Input from User )
### 1. Import Statement
```java
import java.util.Scanner;
```
#### Purpose: 
Tells Java we want to use the Scanner class

#### Why needed: 
Scanner is not automatically available; we must import it

#### Location: 
java.util is the package where Scanner lives

### 2. Class Declaration
```java
public class QuickInput {}
```
#### Purpose: 
Creates a container for our program

#### Naming: 
Class name must match filename (QuickInput.java)

#### Public: 
Means other parts of the program can access it

### 3. Main Method
```java
public static void main(String[] args) {}
```
#### Purpose: 
The starting point of every Java application

#### Required: 
Every program must have a main method

#### Execution: 
Java looks for this method to begin running

### 4. Scanner Object Creation
```java
Scanner input = new Scanner(System.in);
```
#### Scanner input: 
Creates a variable named 'input' of type Scanner

> new Scanner(System.in): Creates a new Scanner object that reads from keyboard

> System.in: Represents the standard input (keyboard)

### 5. Output to User
```java
System.out.print("What's your name? ");
```
> System.out: Standard output (console/screen)

> print(): Displays text without moving to next line

> println(): (Used later) displays text and moves to next line

### 6. Reading Input
```java
String name = input.nextLine();
```
> input.nextLine(): Reads a full line of text entered by user

#### String name: 
Stores the input in a variable called 'name'

#### Variable: 
Like a labeled box that holds information

### 7. Displaying Result
```java
System.out.println("Nice to meet you, " + name + "!");
```
#### String concatenation: 
Using + to combine text and variables

#### Variables in text: 
name gets replaced with actual user input

#### println: 
Adds a new line after displaying the message

### 8. Closing Scanner
```java
input.close();
```
#### Good practice: 
Releases system resources

#### Prevents: 
Memory leaks in larger programs

#### Optional: 
But recommended for clean code

# The Whole Program for taking inputs
```java
// This line imports the Scanner class from Java's utility package
// We need this to read input from the user
import java.util.Scanner;

// This is our main class - every Java program needs one
public class QuickInput {
    
    // This is the main method - where our program starts running
    public static void main(String[] args) {
        
        // Create a Scanner object called 'input'
        // System.in means we're reading from keyboard input
        Scanner input = new Scanner(System.in);
        
        // Print a question to the screen
        // System.out.print() doesn't add a new line after the text
        System.out.print("What's your name? ");
        
        // Read the user's input as text and store it in a variable called 'name'
        // nextLine() reads everything the user types until they press Enter
        String name = input.nextLine();
        
        // Print a greeting message that includes the user's name
        // The + operator combines text with variables
        System.out.println("Nice to meet you, " + name + "!");
        
        // Close the scanner to free up resources
        // This is good practice to prevent memory leaks
        input.close();
    }
}
```

# How the Program Works
## Step-by-Step Execution:
> Import Scanner → Makes Scanner class available

> Create class → Sets up program structure

> Start main method → Program begins running

> Create Scanner object → Prepares to read input

> Display question → Asks user for name

> Wait for input → Program pauses for user to type

> Read input → Captures what user typed

> Display greeting → Shows personalized message

> Close Scanner → Cleans up resources

> Program ends → Execution completes

## Example Output:
```java
What's your name? Sarah
Nice to meet you, Sarah!
```
# Key Concepts for Beginners
## Variables
#### String name: 
A variable that stores text

#### Declaration: 
String name creates the variable

#### Assignment: = 
> input.nextLine() puts value in variable

# Input/Output
#### Input: 
Getting data from user (Scanner)

#### Output: 
Displaying data to user (System.out)

#### Streams: 
System.in (input), System.out (output)

## Methods
> nextLine(): Reads text input

> print()/println(): Displays output

> close(): Cleans up resources

