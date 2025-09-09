# Java Data Types – Complete Guide

In Java, **data types define the kind of data a variable can store** — like numbers, text, or complex objects. Understanding data types is essential because Java is a **strongly typed language**, meaning every variable must have a declared type, and the compiler enforces type compatibility to prevent errors.

---

## Table of Contents
1. [Why Data Types?](#why-data-types)
2. [Primitive Data Types](#primitive-data-types)
3. [Non-Primitive Data Types](#non-primitive-data-types)
4. [Primitive vs Non-Primitive](#primitive-vs-non-primitive)
5. [Memory: Stack vs Heap](#memory-stack-vs-heap)
6. [Type Casting](#type-casting)
7. [Character Encoding: ASCII & Unicode](#character-encoding-ascii--unicode)
8. [Example Program](#example-program)

---

## Why Data Types?

Data types are required so that you (and the compiler) know what "kind" of data a variable can hold. This helps catch errors at compile time rather than at runtime.

For example:
- In Java: `int age = 25;` → compiler knows `age` can only hold integers.
- In JavaScript: `var age = 25;` → `age` can later become a string, leading to potential runtime errors.

Data types provide **flexibility**, **safety**, and **clarity** in programming.

---

## Primitive Data Types

These are basic **built-in types** in Java. They store **simple values**, not objects. Java has 8 primitive types:

### A. Integer Types

| Type   | Size      | Range                                                       | Example                  |
|--------|-----------|-------------------------------------------------------------|--------------------------|
| `byte` | 1 byte    | -128 to +127                                                | `byte age = 25;`         |
| `short`| 2 bytes   | -32,768 to +32,767                                          | `short year = 2025;`     |
| `int`  | 4 bytes   | -2,147,483,648 to +2,147,483,647                            | `int salary = 50000;`    |
| `long` | 8 bytes   | -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807    | `long pop = 1380000000L;`|

> 💡 Use the suffix `L` for `long` literals.

### B. Floating-Point Types

| Type     | Size  | Precision       | Example                |
|----------|-------|-----------------|------------------------|
| `float`  | 4 bytes | 6-7 digits      | `float temp = 36.6f;`  |
| `double` | 8 bytes | 15-16 digits    | `double pi = 3.14159;` |

> 💡 Use the suffix `f` for `float` literals.

### C. Other Types

| Type      | Size   | Example              |
|-----------|--------|----------------------|
| `char`    | 2 bytes| `char grade = 'A';`  |
| `boolean` | 1 bit  | `boolean isOn = true;`|

> 🔍 `boolean` size is JVM-dependent.

---

## Non-Primitive Data Types

These are also called **reference types**. They refer to objects and are stored in the **heap memory**.

Examples:
- `String`
- `Array`
- `Class` objects
- `Interface`

```java
String name = "Ankit";
int[] marks = {90, 80, 85};

# Java Data Types Guide

## Primitive vs Non-Primitive

| Feature           | Primitive                          | Non-Primitive                     |
|-------------------|------------------------------------|-----------------------------------|
| **Type**          | Built-in                           | User-defined or library-defined   |
| **Storage**       | Stack memory                       | Heap memory (via reference)       |
| **Value**         | Actual value                       | Reference (address) to object     |
| **Nullable**      | No                                 | Yes                               |
| **Methods**       | No methods                         | Can have methods                  |
| **Example**       | `int x = 5;`                       | `String s = "Hello";`             |

## Memory: Stack vs Heap

### Stack Memory
- Stores primitive values and method calls
- Fast access, LIFO structure
- Automatically freed when method exits

### Heap Memory
- Stores objects and non-primitive data
- Accessed via references from the stack
- Managed by Garbage Collector

| Feature         | Stack Memory                | Heap Memory                    |
|-----------------|-----------------------------|--------------------------------|
| **Usage**       | Primitives, method frames   | Objects, arrays, strings       |
| **Speed**       | Fast                        | Slower                         |
| **Management**  | Automatic                   | Garbage Collected              |
| **Example**     | `int a = 10;`               | `String s = new String();`     |

## Type Casting

### Implicit Casting (Widening)
Automatically done by the compiler when converting a smaller type to a larger type.

```java
byte a = 45;
double b = a; //  Auto-conversion

# Java Data Types Guide

## Type Casting in Java

Type casting is a process of converting one type of data to another.

### Implicit Casting (Widening)
- Automatically done by the Java compiler
- Converts smaller types to larger types
- No loss of precision
- Conversion order: byte → short → char → int → long → float → double

**Example:**
```java
byte a = 45;
double b = a; // Auto-conversion (1 byte → 8 bytes)

# Java Type Casting and Memory Management

## Explicit Casting (Narrowing)

- Must be done manually by the programmer
- Converts larger types to smaller types
- May lead to loss of precision
- Requires explicit type specification in parentheses

**Example:**
```java
double a = 45.5;
byte b = (byte) a; // ✅ Explicit cast → b = 45 (0.5 lost)

a (8 bytes) → b (1 byte)
[45.5] → [45] (precision loss: 0.5 discarded)

# Memory: Stack vs Heap

## Stack Memory
- Stores primitive values and method calls
- Fast access, LIFO structure
- Automatically freed when method exits

## Heap Memory
- Stores objects and non-primitive data
- Accessed via references from the stack
- Managed by Garbage Collector

| Feature         | Stack Memory                | Heap Memory                    |
|-----------------|-----------------------------|--------------------------------|
| **Usage**       | Primitives, method frames   | Objects, arrays, strings       |
| **Speed**       | Fast                        | Slower                         |
| **Management**  | Automatic                   | Garbage Collected              |
| **Example**     | `int a = 10;`               | `String s = new String();`     |

# Character Encoding: ASCII & Unicode

- **ASCII**: 7-bit code, 128 symbols (English only)
- **Unicode**: 16-bit code, 65,536 symbols (supports worldwide languages)

Java uses Unicode for `char` type.

**Example:**
```java
char ch = 'A'; // Stored as Unicode value


**Example:**
public class DataTypeDemo {
    public static void main(String[] args) {
        // Primitive types
        int age = 20;
        double score = 89.5;
        char grade = 'A';
        boolean isPassed = true;

        // Non-primitive types
        String name = "Ankit";
        int[] marks = {90, 85, 88};

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }
}