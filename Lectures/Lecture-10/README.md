# Strings in Java
## What is a String in Java?
A String is a sequence of characters enclosed in double quotes (" ")

### Example:

```java
String name = "Roy";
```

#### Two Ways to Create Strings
- String Literal: String s1 = "Hello"; (uses String Pool)

- Using new keyword: String s2 = new String("Hello"); (creates new object)

  
### Important: 
In Java, a String is an object of the String class (not a primitive data type like int or char)

## Key Properties of Strings
### 1. Immutable
Once a String object is created, its value cannot be changed.

### Example:

```java
String s = "Hello";
s.concat(" World");
System.out.println(s);
```
### Output: 
```text
Hello (not Hello World)
```
### To update, you must store the result:

```java
s = s.concat(" World");
System.out.println(s);
```
### Output: 
```text
Hello World
```
### 2. Stored in the String Pool
Java maintains a special memory area called the String Pool to save memory

When a String is created using literals `(String s = "Hello";)`, Java checks if it already exists in the pool

### Example 
```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println(s1 == s2); // true (same object in pool)
System.out.println(s1 == s3); // false (different objects)
System.out.println(s1.equals(s3)); // true (same content)
```

### 3. Common String Operations

| Operation               | Method / Example                     | Output                                      |
|-------------------------|--------------------------------------|---------------------------------------------|
| Length of string        | `str.length()`                       | `"save".length() = 4`                       |
| Concatenation           | `str1 + str2` <=> `str1.concat(str2)` | `"Hello" + "World" = HelloWorld`           |
| Character at            | `str.charAt(2)`                      | `"Save".charAt(2) = 'v'`                    |
| Substring               | `str.substring(1, 4)`                | `"Programming".substring(1, 4) = "rog"`     |
| Uppercase conversion    | `str.toUpperCase()`                  | `"java".toUpperCase() = JAVA`               |
| Lowercase conversion    | `str.toLowerCase()`                  | `"JAVA".toLowerCase() = java`               |
| Remove space            | `str.trim()`                         | `"Hello ".trim() = "Hello"`                 |
| Replace text            | `str.replace('s','o')`               | `"save".replace('s','o') = "oave"`          |
| String equality         | `str1.equals(str2)`                  | `"java".equals("java") = true`              |
| Ignore case equality    | `str1.equalsIgnoreCase(str2)`        | `"java".equalsIgnoreCase("JAVA") = true`    |


### 4. StringBuilder - Mutable Strings

- **StringBuilder allows modification of string without creating new objects.**
- More efficient for operations like appending, inserting, deleting, or reversing text.


## Common Methods:

| Method    | Description               | Example                  |
|-----------|---------------------------|--------------------------|
| `append()` | Adds text at end          | `sb.append(" World");`   |
| `insert()` | Insert at index           | `sb.insert(5, "Java");`  |
| `delete()` | Remove part of text       | `sb.delete(1, 4);`       |
| `reverse()`| Reverse text              | `sb.reverse();`          |

## Example:

```java
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH
    }
}
```

### 5. StringBuffer
- Similar to StringBuilder, but thread-safe (synchronized) for multi-threaded programs

- Slower than StringBuilder in single-threaded scenarios

- Used when thread safety is required

- StringBuffer vs StringBuilder:

```java
// StringBuilder (not thread-safe, faster)
StringBuilder sb = new StringBuilder("Hello");

// StringBuffer (thread-safe, slower)
StringBuffer sbf = new StringBuffer("Hello");
```
### 6. Important String Methods
#### Comparison Methods
`equals()` - compares content

`equalsIgnoreCase()` - case-insensitive comparison

`compareTo()` - lexicographical comparison

`compareToIgnoreCase()` - case-insensitive lexicographical comparison

#### Search Methods
`contains()` - checks if string contains substring

`indexOf()` - returns first occurrence index

`lastIndexOf()` - returns last occurrence index

`startsWith()` - checks if string starts with prefix

`endsWith()` - checks if string ends with suffix

#### Modification Methods
`replace()` - replaces characters/substrings

`replaceAll()` - replaces all occurrences using regex

`replaceFirst()` - replaces first occurrence using regex

`split()` - splits string into array using delimiter

`join()` - joins strings with delimiter

### 7. Memory Efficiency Tips
- Use String Literals when possible for better memory usage

- Use StringBuilder/Buffer for multiple string modifications

- Avoid + operator in loops - use StringBuilder instead

### Bad Example:

```java
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i; // Creates new String object each time
}
```
### Good Example:

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);
}
String result = sb.toString();
```
## Java Programs used on Strings

```java
public class Stringss {
    public static void main(String[] args) {
        // 1. Length of a string 
        String str1 = "Java";
        System.out.println("Length of \"" + str1 + "\" → " + str1.length());

        // 2. Concatenation
        String str2 = "Hello";
        String str3 = "Java";
        System.out.println(str2 + " + " + str3 + " = " + (str2 + str3));
        System.out.println("Using concat() " + str2 + " + " + str3 + " = " + str2.concat(str3));
        
        // 3. Character at Index
        System.out.println(str2 + " having charAt(2) with value " + str1.charAt(2));
        
        // 4. Substring Extraction
        String str4 = "Programming";
        System.out.println(str4 + " Using .substring(1,4) will give " + str4.substring(1,4));

        // 5. UpperCase Conversion
        String str5 = "java";
        System.out.println(str5 + " Using .toUpperCase() will give " + str5.toUpperCase());
        
        // 6. LowerCase Conversion
        String str6 = "JAVA";
        System.out.println(str6 + " Using .toLowerCase() will give " + str6.toLowerCase());

        // 7. Remove Spaces
        String str7 = " Welcome to Java   ";
        System.out.println("Before trim: '" + str7 + "'");
        System.out.println("After trim: '" + str7.trim() + "'");

        // 8. Replace Characters
        System.out.println("JAVA.replace('A','O') will give: " + "JAVA".replace('A', 'O'));

        // 9. Equals Comparison
        System.out.println("Comparing " + str2 + " with " + str3 + " will give " + str2.equals(str3));

        // 10. Ignore Case Equality
        System.out.println("Using .equalsIgnoreCase for " + str5 + " with " + str6 + " will give " + str5.equalsIgnoreCase(str6));

        // StringBuilder Examples
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
```

## Output will be as

```text
Length of "Java" → 4
```
```text
Hello + Java = HelloJava
```
```text
Using concat() Hello + Java = HelloJava
```
```text
Hello having charAt(2) with value v
```
```text
Programming Using .substring(1,4) will give rog
```
```text
java Using .toUpperCase() will give JAVA
```
```text
JAVA Using .toLowerCase() will give java
```
```text
Before trim: ' Welcome to Java   '
```
```text
After trim: 'Welcome to Java'
```
```text
JAVA.replace('A','O') will give: JOVO
```
```text
Comparing Hello with Java will give false
```
```text
Using .equalsIgnoreCase for java with JAVA will give true
```
```text
After append: Hello World
```
```text
After reverse: dlroW olleH
```
