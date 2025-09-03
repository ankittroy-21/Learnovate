# Java Arrays 

## What is an Array?

An **array** is like a container that can hold multiple values of the same type. Think of it as a row of lockers where each locker stores one item, and all lockers are of the same size!

### Real-life Example:
Imagine a **egg carton** - it holds multiple eggs (same type) in separate compartments (indexed positions).

---

## Why Use Arrays? 

- **Store multiple values** under one name
- **Easy access** to elements using index numbers
- **Efficient memory usage**
- **Perfect for collections** of similar items

---

## Array Declaration & Initialization

### Method 1: Declare then Initialize
```java
// Declaration
int[] numbers;

// Initialization
numbers = new int[5]; // Array of 5 integers
```
### Method 2: Declare and Initialize together
```java
int[] numbers = new int[5]; // Array of 5 integers
```
### Method 3: Direct Initialization with values
```java
int[] numbers = {1, 2, 3, 4, 5}; // Array with pre-filled values
```
## Array Indexing 
Arrays use zero-based indexing - the first element is at index 0!

```java
int[] scores = {95, 87, 92, 78, 88};

// Accessing elements:
System.out.println(scores[0]); // Output: 95 (first element)
System.out.println(scores[2]); // Output: 92 (third element)
System.out.println(scores[4]); // Output: 88 (last element)
```
### Visual Representation:
```text
Index:   0    1    2    3    4
Value:  95   87   92   78   88
```
## Common Array Operations
### 1. Finding Array Length
```java
int[] numbers = {10, 20, 30, 40, 50};
int length = numbers.length; // Returns 5
System.out.println("Array length: " + length);
```
### 2. Modifying Array Elements
```java
int[] prices = {100, 200, 300};
prices[1] = 250; // Change second element from 200 to 250
System.out.println(prices[1]); // Output: 250
```
### 3. Looping Through Arrays
```java
// Using for loop
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
}

// Using enhanced for loop (for-each)
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```
## Default Values in Arrays

When you create an array without initializing values, Java provides default values:

| Data Type | Default Value |
|-----------|---------------|
| `int`     | `0`           |
| `double`  | `0.0`         |
| `boolean` | `false`       |
| `char`    | `'\u0000'`    |
| `String`  | `null`        |

**Example:**
```java
int[] numbers = new int[3];        // Contains [0, 0, 0]
double[] decimals = new double[2]; // Contains [0.0, 0.0]
boolean[] flags = new boolean[2];  // Contains [false, false]
char[] letters = new char[3];      // Contains ['\u0000', '\u0000', '\u0000']
String[] names = new String[2];    // Contains [null, null]
```
# Array Examples 

## Example 1: Counting Occurrences of a Number

```java
import java.util.Arrays;

public class ArrayExamples {
    
    /**
     * Counts how many times a specific number appears in an array
     * @param arr - the array to search through
     * @param key - the number to count
     * @return the number of times the key appears in the array
     */
    public static int countOccurrences(int[] arr, int key) {
        int count = 0; // Initialize counter to zero
        
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if current element matches our key
            if (arr[i] == key) {
                count++; // Increase count if match found
            }
        }
        return count; // Return the final count
    }
    
    public static void main(String[] args) {
        // Create an array with some numbers
        int[] numbers = {1, 2, 3, 2, 4, 2};
        int targetNumber = 2;
        
        // Call our method to count occurrences
        int result = countOccurrences(numbers, targetNumber);
        
        // Display the result
        System.out.println("The number " + targetNumber + 
                          " appears " + result + " times in the array");
        // Output: The number 2 appears 3 times in the array
    }
}
```
## Example 2: Reversing an Array
```java
import java.util.Arrays;

public class ArrayReversal {
    
    /**
     * Reverses the elements of an array
     * @param arr - the array to be reversed
     */
    public static void reverseArray(int[] arr) {
        // Use two pointers: one from start, one from end
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            // Swap elements at left and right positions
            int temp = arr[left];      // Store left element temporarily
            arr[left] = arr[right];    // Move right element to left
            arr[right] = temp;         // Move temp (original left) to right
        }
    }
    
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Display original array
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Reverse the array
        reverseArray(numbers);
        
        // Display reversed array
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
        // Output: Reversed Array: [5, 4, 3, 2, 1]
    }
}
```
## Example 3: Linear Search in Array
```java
public class LinearSearchExample {
    
    /**
     * Searches for a number in an array using linear search
     * @param arr - the array to search through
     * @param key - the number to find
     * @return the index of the key if found, -1 if not found
     */
    public static int linearSearch(int[] arr, int key) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if current element matches our key
            if (arr[i] == key) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
    
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {10, 25, 30, 45, 50};
        int searchNumber = 30;
        
        // Search for the number
        int index = linearSearch(numbers, searchNumber);
        
        // Display result
        if (index != -1) {
            System.out.println("Number " + searchNumber + 
                              " found at index: " + index);
            // Output: Number 30 found at index: 2
        } else {
            System.out.println("Number " + searchNumber + " not found in the array");
        }
    }
}
```
## Example 4: Different Ways to Create Arrays
```java
import java.util.Arrays;

public class ArrayCreationExamples {
    public static void main(String[] args) {
        
        // Method 1: Declaration then initialization
        int[] array1;              // Just declare the array
        array1 = new int[5];       // Initialize with size 5 (all zeros)
        
        // Method 2: Declaration and initialization together
        int[] array2 = new int[3]; // Array of 3 integers (all zeros)
        
        // Method 3: Direct initialization with values (literal)
        int[] array3 = {10, 20, 30}; // Compiler infers size is 3
        
        // Method 4: String array
        String[] names = new String[3]; // Array of 3 Strings (all null)
        
        // Display all arrays
        System.out.println("Array1: " + Arrays.toString(array1)); // [0, 0, 0, 0, 0]
        System.out.println("Array2: " + Arrays.toString(array2)); // [0, 0, 0]
        System.out.println("Array3: " + Arrays.toString(array3)); // [10, 20, 30]
        System.out.println("Names: " + Arrays.toString(names));   // [null, null, null]
        
        // Fill array1 with values
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (i + 1) * 10; // 10, 20, 30, 40, 50
        }
        System.out.println("Filled Array1: " + Arrays.toString(array1));
    }
}
```
## Key Concepts Explained
### 1. Array Declaration vs Initialization
- Declaration: `int[] arr;` (just creates a reference)

- Initialization: `arr = new int[5];` (creates actual array in memory)

### 2. Array Indexing
- Arrays start at index `0`

- Last element is at index `length - 1`

- Access elements using `arr[index]`

### 3. Array Length
- Use `arr.length` (not `arr.length()`)

- Length is fixed after creation

### 4. Common Operations
- Counting: Loop through and check each element

- Searching: Linear search checks each element sequentially

- Reversing: Swap elements from ends toward center

- Modifying: Change values using `arr[index] = value`

## Key Takeaways
**1.** Arrays store multiple values of the same type

**2.** Indexing starts at 0 - first element is at index 0 and last element will be at -1

**3.** Use .length to get array size (not .length())

**4.** Always check bounds to avoid `ArrayIndexOutOfBoundsException`

**5.** Arrays are fixed-size - cannot change size after creation

## Tips for Beginners
- Always check array bounds to avoid ArrayIndexOutOfBoundsException

- Use meaningful variable names like studentGrades instead of just arr

- Initialize arrays properly before using them

- Use enhanced for loops when you don't need the index

- Test with small arrays first before working with larger data

*Remember: Practice makes perfect! Try creating your own arrays and experiment with different operations.*
