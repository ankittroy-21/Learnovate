## 🔹 What is a Variable?

* A **variable** is like a **named box in memory** that stores data.
* In Java, every variable must have a **type of Data** (because Java is **statically & strongly typed programming language(others C,C++,Typescript...) **).
* Why? → So the compiler knows **how much memory to allocate** and **what operations are allowed**.

---

## 🔹 Declaration vs Initialization

### ✅ Declaration

* **What it means:** Telling Java the **type** of data the variable will hold and giving it a name.
* **Why:** Reserves space in memory but doesn’t put a value yet. Useful when the value will come later.

```java
int age;       // declared, no value yet
```

---

### ✅ Initialization

* **What it means:** Assigning the **first value** to a declared variable.
* **Why:** Without initialization, local variables cannot be used.

```java
age = 16;      // initialized with a value
```

---

### ✅ Declaration + Initialization Together

* **Best practice when you already know the value.**
* Reduces risk of “uninitialized variable” errors.

```java
int age = 16;      // declare + initialize
String name = "John";
```

---

Example:

```java
// Case 1: Know the value
int count = 10;   // declare + initialize

// Case 2: Value comes later (e.g., user input)
int age;                // declare
age = scanner.nextInt(); // initialize later
```

---

## 🔹 Types of Variables in Java

1. **Local Variables** – Inside methods/blocks, must be initialized before use.
2. **Instance Variables** – Defined in a class, each object has its own copy.
3. **Static Variables** – Shared across all objects of a class.

---

## 🔹 Constants (Final Variables)

* Use `final` keyword → value cannot change.
* Why? → Useful for fixed values like `PI`, configuration constants, etc.

```java
final double PI = 3.14159;
```

---

So,as Java is Statically & Strongly typed programming language,learning data types must .

in next lecture we dive into the concepts of java Data Types like int ,float,String....