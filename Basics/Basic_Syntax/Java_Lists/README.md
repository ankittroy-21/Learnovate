# Java Lists 

## What are Lists?

**Lists** are ordered collections that can store multiple elements of the same type. Unlike arrays, lists can grow and shrink dynamically! Think of them like expandable shopping lists where you can add or remove items anytime.

### Real-life Example:
Imagine a **playlist** - you can add songs, remove songs, rearrange them, and the playlist automatically adjusts its size!

---

## Why Use Lists? 

- **Dynamic sizing** - No fixed size like arrays
- **Easy insertion and deletion** of elements
- **Built-in methods** for common operations
- **Part of Java Collections Framework**
- **Type safety** with generics

---

## Types of Lists in Java

### 1. ArrayList
```java
import java.util.ArrayList;

// Most commonly used list
ArrayList<String> names = new ArrayList<>();
```
### 2. LinkedList
```java
import java.util.LinkedList;
// Better for frequent insertions/deletions
LinkedList<Integer> numbers = new LinkedList<>();
```
## Creating and Initializing Lists
### Basic Declaration
```java
// ArrayList example
ArrayList<String> fruits = new ArrayList<>();

// LinkedList example  
LinkedList<Integer> scores = new LinkedList<>();

// With initial values (Java 9+)
List<String> colors = List.of("Red", "Green", "Blue");
```
### With Specific Type (Generics)
```java
ArrayList<Integer> numbers = new ArrayList<>();    // Stores integers
ArrayList<String> names = new ArrayList<>();       // Stores strings
ArrayList<Double> prices = new ArrayList<>();      // Stores decimals
```
## Common List Operations
### 1. Adding Elements
```java
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");      // Add to end
fruits.add("Banana");
fruits.add(1, "Mango");   // Add at specific position

System.out.println(fruits); // [Apple, Mango, Banana]
```
### 2. Accessing Elements
```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);

// Get element by index
int first = numbers.get(0);    // 10
int second = numbers.get(1);   // 20

// Check if list contains element
boolean hasTwenty = numbers.contains(20); // true
```
### 3. Removing Elements
```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

fruits.remove(1);          // Remove by index (removes "Banana")
fruits.remove("Apple");    // Remove by value

System.out.println(fruits); // [Orange]
```
### 4. Finding List Size
```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);

int size = numbers.size(); // Returns 3
boolean isEmpty = numbers.isEmpty(); // false
```
## Looping Through Lists
### Traditional For Loop
```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

for (int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}
Enhanced For Loop (Recommended)
java
for (String fruit : fruits) {
    System.out.println(fruit);
}
Using forEach (Java 8+)
java
fruits.forEach(fruit -> System.out.println(fruit));
```

## Useful List Methods

| Method | Description | Example |
|--------|-------------|---------|
| `add(element)` | Add element to end | `list.add("Apple")` |
| `add(index, element)` | Add at specific position | `list.add(1, "Mango")` |
| `get(index)` | Get element by index | `list.get(0)` |
| `set(index, element)` | Replace element | `list.set(1, "Berry")` |
| `remove(index)` | Remove by index | `list.remove(0)` |
| `remove(element)` | Remove by value | `list.remove("Apple")` |
| `size()` | Get list size | `list.size()` |
| `isEmpty()` | Check if empty | `list.isEmpty()` |
| `contains(element)` | Check if contains | `list.contains("Apple")` |
| `clear()` | Remove all elements | `list.clear()` |

---

## ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| **Internal Structure** | Dynamic array | Doubly linked list |
| **Access Time** | Fast (O(1)) | Slow (O(n)) |
| **Insertion/Deletion** | Slow (O(n)) | Fast (O(1)) |
| **Memory Usage** | Less overhead | More overhead |
| **Use Case** | Frequent access | Frequent modifications |

**When to use which:**
- Use **ArrayList** for mostly reading data
- Use **LinkedList** for frequent insertions/deletions


## Practical Examples 
### Example 1: Student Grades
```java
import java.util.ArrayList;

public class GradeManager {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        
        // Add grades
        grades.add(85);
        grades.add(92);
        grades.add(78);
        
        // Calculate average
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double average = (double) total / grades.size();
        
        System.out.println("Average grade: " + average);
    }
}
```
### Example 2: Shopping Cart
```java
import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        
        // Add items to cart
        cart.add("Milk");
        cart.add("Bread");
        cart.add("Eggs");
        
        // Remove an item
        cart.remove("Bread");
        
        // Check if cart contains item
        if (cart.contains("Milk")) {
            System.out.println("Milk is in the cart!");
        }
        
        System.out.println("Cart items: " + cart);
    }
}
```
## Common Errors & Solutions 
### Error 1: IndexOutOfBoundsException
```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
String item = list.get(5); // ❌ Index 5 doesn't exist!
```
*Solution:*

```java
int index = 5;
if (index >= 0 && index < list.size()) { // ✅ Check bounds first
    String item = list.get(index);
}
```
### Error 2: Forgetting Import
```java
ArrayList<String> list = new ArrayList<>(); // ❌ Need to import
```
*Solution:*

```java
import java.util.ArrayList; // ✅ Add at top of file
```
### Error 3: Using Raw Types
```java
ArrayList list = new ArrayList(); // ❌ Raw type (not recommended)
list.add("Hello");
list.add(123); // Mixed types - can cause errors later
```
*Solution:*

```java
ArrayList<String> list = new ArrayList<>(); // ✅ Specify type
list.add("Hello");
// list.add(123); // ❌ Now compiler will prevent this
```
## Best Practices 
### 1. Use Interface Type for Declaration
```java
// ✅ Good practice
List<String> names = new ArrayList<>();

// ❌ Less flexible
ArrayList<String> names = new ArrayList<>();
```
### 2. Specify Capacity for Large Lists
```java
// If you know approximate size
ArrayList<String> bigList = new ArrayList<>(1000);
```
### 3. Use Enhanced For Loops
```java
// ✅ Clean and readable
for (String item : list) {
    System.out.println(item);
}

// ❌ More verbose
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```
### 4. Check Empty Lists Properly
```java
// ✅ Correct way
if (list.isEmpty()) {
    System.out.println("List is empty");
}

// ❌ Less efficient
if (list.size() == 0) {
    System.out.println("List is empty");
}
```
## Practice Exercises 
### Exercise 1: Find Maximum Value
```java
// Create a method to find maximum value in a list of integers
public static int findMax(ArrayList<Integer> numbers) {
    // Your code here
}
```
## Exercise 2: Remove Duplicates
```java
// Create a method to remove duplicates from a list
public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
    // Your code here
}
```
### Exercise 3: Merge Two Lists
```java
// Merge two lists into one
public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, 
                                          ArrayList<Integer> list2) {
    // Your code here
}
```
## Quick Reference Cheat Sheet 📋
### Declaration:
```java
ArrayList<Type> list = new ArrayList<>();     // Most common
LinkedList<Type> list = new LinkedList<>();   // For frequent modifications
List<Type> list = new ArrayList<>();          // Using interface type
```
### Common Operations:
```java
list.add(element);           // Add element
list.get(index);             // Get element
list.set(index, element);    // Replace element  
list.remove(index);          // Remove by index
list.size();                 // Get size
list.contains(element);      // Check if contains
```
### Looping:
```java
// Enhanced for loop (recommended)
for (Type item : list) {
    System.out.println(item);
}

// Traditional for loop
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

// forEach with lambda (Java 8+)
list.forEach(item -> System.out.println(item));
```
##  Key Takeaways
- Lists are dynamic - can grow and shrink as needed

- ArrayList is most common - good for general use

- LinkedList is better for frequent insertions/deletions

- Use generics for type safety (ArrayList<String>)

- Check bounds before accessing by index

-Prefer enhanced for loops for readability

**Remember:** *Lists are your friends for storing collections of data! Practice creating different types of lists and experiment with their methods.*

**Happy coding! 🚀**
