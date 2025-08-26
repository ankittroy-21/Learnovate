# Control Statements

## 1. Control Structures Overview

Control structures are used to **control the flow of execution** in a program. They help you make **decisions**, **repeat tasks**, and **choose actions** based on conditions.

In Java, the main control structures are:

1. **Decision Making**: if, if-else, if-else-if, switch  
2. **Loops**: while, for, do-while  
3. **Jump Statements**: break, continue, return *(optional in this topic)*

## 2. If-Else Statements
### What is If-Else?
An **if-else statement** is like a digital decision-maker in your code. It helps your program choose between different paths based on conditions, just like making choices in real life!

### Simple Real-Life Example:
Think of a traffic light:
- **IF** the light is GREEN → Go
- **ELSE IF** the light is YELLOW → Slow down  
- **ELSE** (light is RED) → Stop

**Syntax:**

```java
if (condition) {
    // code to execute if condition is true  
} else {  
    // code to execute if condition is false  
}
```
**Flow:**

- Condition is checked → if true, execute first block.  
- If false, execute else block.  

**Example:**

```java
int age = 18;  
if (age >= 18) {
    System.out.println("You are eligible to vote.");  
} else {  
    System.out.println("You are not eligible to vote.");  
}
```
#### Output :
```java
You are eligible to vote.
```
## 3. If-Else-If Ladder

The if-else-if ladder allows you to check multiple conditions sequentially. The program evaluates each condition from top to bottom. When it finds the first condition that is true, it executes the corresponding block of code and then exits the entire ladder without checking the remaining conditions. If none of the conditions are true, the else block (if present) is executed.

**Syntax:**

```java
if (condition1) {
    // code if condition1 is true  
} else if (condition2) {
    // code if condition2 is true  
} else {
    // code if all conditions are false  
}
```
#### Example :
```java
int marks = 75;  
if (marks >= 90) {
    System.out.println("Grade: A+");  
} else if (marks >= 75) {
    System.out.println("Grade: A");  
} else if (marks >= 60) {
    System.out.println("Grade: B");  
} else {
    System.out.println("Grade: C");  
}
```
#### Output :
```java
Grade: A
```

## 4. Switch Statement
The switch statement evaluates an expression and matches its value against various case labels. When a match is found, the code within that case block executes until a break statement is encountered. If no case matches, the default block (if present) executes. The break statement is crucial to prevent "fall-through" to subsequent cases.

- Used when you have multiple possible values for a single variable.
- Works with byte, short, int, char, String, and enum.

**Syntax:**

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```
#### Example :
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```
#### Output :
```java
Wednesday
```
## 5. Loops in Java

### A) While Loop

A while loop is like a repeating "if statement" - it keeps executing the same block of code over and over again **as long as** the condition remains true. Think of it as: "While this condition is true, keep doing this action."

**Key Points:**
- Checks the condition FIRST before running the code
- If condition is false initially, the code inside never runs
- Good when you don't know exactly how many times you need to repeat

**Syntax:**
```java
while (condition) {
    // code to repeat
}
```
#### Example :
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```
#### Output :
```java
1
2
3
4
5
```
### B) For Loop

A for loop is like a counter-controlled loop - it's perfect when you know **exactly how many times** you want to repeat something. It has three parts: starting point, ending condition, and how to count.

**Key Points:**
- Everything is set up in one line (initialization, condition, increment)
- Very organized and compact
- Ideal for counting and iterating through arrays/collections

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // code to repeat
}
```
#### Example :
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

#### Output :
```java
1
2
3
4
5
```
### C) Do-While Loop

**Definition for Beginners:**
A do-while loop is like a while loop that **guarantees at least one execution** - it does the action first, then checks if it should repeat. Think of it as: "Do this first, then check if we should keep doing it."

**Key Points:**
- Executes the code block FIRST, then checks the condition
- Always runs at least once, even if condition is false
- Useful for menus and user input validation

**Syntax:**
```java
do {
    // code to execute at least once
} while (condition);
```
#### Example :
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

#### Output :
```java
1
2
3
4
5
```
## 6. Quick Comparison Table

| Loop Type | Condition Checked | Executes At Least Once? | Best Use Case |
|---|---|---|---|
| while     | Before body       | ❌ No                   | Repeat until a condition changes, unsure count |
| for       | Before body       | ❌ No                   | Known number of iterations |
| do-while  | After body        | ✅ Yes                  | Execute at least once before checking |
