# Java Data Types
In Java, **data types define the kind of data a variable can store** — like numbers, text, or
complex objects.
## Java Data Types

* **Primitive Types**
* **Non-Primitive Types**

## 1. Primitive Data Types
These are basic **built-in types** in Java. They store **simple values**, not objects. Java has 8
primitive types, divided into categories:

### A. Numeric Types

| Type | Size | Example | Purpose |
|---|---|---|---|
| `byte` | 1 **byte** | byte age = 25; | Small integers |
| `short` | 2 **bytes** | short year = 2025; | Medium-size integers |
| `int` | 4 **bytes** | int salary = 50000; | Default for integers |
| `long` | 8 **bytes** | long population = 1380000000L; | Very large integers |

### B. Floating-point Types
| Type | Size | Example | Purpose |
|---|---|---|---|
| `float` | 4 **bytes** | float temp = 36.6f; | Decimal numbers (less precision) |
| `double` |  8**bytes** | double pi = 3.14159; | Decimal numbers (more precision) |

### C. Other Types
| Type | Size | Example | Purpose |
|---|---|---|---|
| `char` | 2 **bytes** | char grade = 'A'; | Single characters |
| `boolean` | 1 **bit** | boolean isOn = true; | True/False values |

## Key Points about Primitive Types:
- Stored in heap memory
- Can be null
- Can call methods (e.g., name.length(), arr.length)
- More flexible, used in OOP

***

### Primitive vs Non-Primitive – At a Glance

| Feature | Primitive | Non-Primitive |
| :--- | :--- | :--- |
| `Type` | Built-in | Custom or library-defined |
| `Value` | Stores actual value | Stores memory reference |
| `Methods` | No | Yes (e.g., length(), equals()) |
| `Memory` | Stack | Heap |
| `Nullable?` | No | Yes (null allowed) |
| `Example` | int x = 5; | String s = "Hello"; |

### Quick Demo Example:

```java
public class DataTypeDemo { // Keep class name exact same as your file name
    public static void main(String[] args) {
        int age = 20;                  // Primitive
        String name = "Ankit";       // Non-Primitive
        int[] marks = {90, 80, 85};    // Non-Primitive (Array)
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("First Mark: " + marks[0]);
    }
}
```
***

## Difference Between Primitive and Non-Primitive Data Types Based on Memory

| Feature | Primitive Data Types | Non-Primitive Data Types |
| :--- | :--- | :--- |
| `Memory Location` | Stored in the stack memory | Reference (address) is stored in stack, but the actual object is stored in heap memory |
| `What Is Stored` | The actual value (like 5, true, A) is directly stored | A reference (memory address) to the object in the heap |
| `Size & Simplicity` | Small and fixed in size (e.g., 4 bytes for int) → lightweight | Size varies depending on object complexity → heavier |
| `Access Speed` | Faster access because values are stored directly in stack | Slightly slower since reference must point to heap to access actual data |
| `Garbage Collection` | Not applicable (auto-managed by the system) | Managed by Garbage Collector in JVM to free unused heap memory |
| `Example` | int a = 10; → a stores the value 10 directly | String s = "Hello"; → s stores a reference to "Hello" stored in heap |

### Why It Matters:

- Primitive types are great for simple values and high-speed operations.
- Non-primitive types are used when you need to manage collections, complex data, or objects.

***

## Difference Between Stack and Heap Memory in Java

Java uses two major memory areas during program execution:

- Stack ← Fast, organised, method-level
- Heap ← Slower, dynamic, object-level

### What is Stack Memory?

Characteristics:

- Stores method calls, local variables, and primitive data types
- Works in LIFO (Last-In, First-Out) order
- Memory is automatically allocated and deallocated
- Very fast because of the fixed-size and simple structure

Example:
```java
int a = 10;
```
- The variable a and its value 10 are stored directly in the stack.

### What is Heap Memory?

Characteristics:

- Stores all objects and non-primitive types (String, Array, custom classes)
- Accessed via references stored in the stack
- Managed by the JVM Garbage Collector
- Slower than stack because memory allocation is more complex

Example:
```java
String name = "Ankit";
```
- The reference name is stored in the stack, and the actual "Vinayak" string object is stored in the heap.

### Stack vs Heap – Tabular Comparison

| Feature | Stack Memory | Heap Memory |
| :--- | :--- | :--- |
| `Used For` | Method calls, local variables, primitives | Objects, arrays, strings, class instances |
| `Memory Allocation` | Automatic (at compile/runtime) | Manual/automatic (dynamic, at runtime) |
| `Access Speed` | Faster | Slower |
| `Lifetime` | Limited to method execution | Until object is no longer referenced |
| `Managed By` | JVM directly | JVM + Garbage Collector |
| `Thread Safety` | Thread-safe (each thread has its own stack) | Not thread-safe by default (shared among threads) |
| `Example` | int x = 5; | Student s = new Student() |

## Common Interview Analogy:
**Stack** is like a plate rack (last plate placed is the first taken out).

**Heap** is like a big shelf – you store things randomly and need a label (reference) to find them.
