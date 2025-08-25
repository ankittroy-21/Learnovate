# Java Operators

## What are Operators in Java?

**Operators** are symbols that perform **operations** on variables and values.  
For example, `+`, `-`, `*`, `/`, etc.

Java supports many types of operators, grouped based on the kind of task they perform.

## Types of Operators in Java

### 1. Arithmetic Operators

Used to perform basic mathematical operations.

| Operator | Description        | Example |
|----------|--------------------|---------|
| `+`      | Addition           | `a + b` |
| `–`      | Subtraction        | `a – b` |
| `*`      | Multiplication     | `a * b` |
| `/`      | Division           | `a / b` |
| `%`      | Modulus (remainder)| `a % b` |

**Example**:  
```java
int a = 10, b = 3;  
System.out.println(a + b); // 13  
System.out.println(a % b); // 1
```
### 2. Relational / Comparison Operators

Used to compare two values.

| Operator | Description      | Example   |
|----------|------------------|-----------|
| `==`     | Equal to         | `a == b`  |
| `!=`     | Not equal to     | `a != b`  |
| `>`      | Greater than     | `a > b`   |
| `<`      | Less than        | `a < b`   |
| `>=`     | Greater or equal | `a >= b`  |
| `<=`     | Less or equal    | `a <= b`  |

**Example**:
```java
int x = 5, y = 8;
System.out.println(x > y); // false
System.out.println(x != y); // true
```
### 3. Logical Operators

Used to perform logical operations, mostly with conditions.

| Operator | Description  | Example                |
|----------|--------------|------------------------|
| `&&`     | Logical AND  | `(a > b) && (a < c)`   |
| `\|\|`   | Logical OR   | `x < 5 \|\| x < 4`     |
| `!`      | Logical NOT  | `! (a > b)`            |

**Example**:
```java
int age = 25;
System.out.println(age > 18 && age < 30); // true
System.out.println((age == 25)); // false
```
### 4. Assignment Operators

Used to assign values to variables.

| Operator | Example   | Same As      |
|----------|-----------|--------------|
| `=`      | `x = 5`   | `x = 5`      |
| `+=`     | `x += 3`  | `x = x + 3`  |
| `-=`     | `x -= 3`  | `x = x - 3`  |
| `*=`     | `x *= 3`  | `x = x * 3`  |
| `/=`     | `x /= 3`  | `x = x / 3`  |
| `%=`     | `x %= 3`  | `x = x % 3`  |
| `&=`     | `x &= 3`  | `x = x & 3`  |
| `^=`     | `x ^= 3`  | `x = x ^ 3`  |
| `>>=`    | `x >>= 3` | `x = x >> 3` |
| `<<=`    | `x <<= 3` | `x = x << 3` |

**Example**:
```java
int a = 10;
a += 5; // a = a + 5 → 15
```
### 5. Unary Operators

Operate on a single operand.

| Operator | Description                 | Example        |
|----------|-----------------------------|----------------|
| `+`      | Unary plus (positive number)| `+a`           |
| `-`      | Unary minus (negate)        | `-a`           |
| `++`     | Increment                   | `a++` or `++a` |
| `--`     | Decrement                   | `a--` or `--a` |
| `!`      | Logical NOT                 | `!true`        |

**Example**:
```java
int a = 10;
System.out.println(++a); // 11 (pre-increment)
System.out.println(a--); // 11 (post-decrement, then becomes 10)

int a = 10;
int positive = +a; // Unary plus (doesn't change the value)
int negative = -a; // Unary minus (negates the value)

System.out.println("Original a: " + a);
System.out.println("Unary Plus: " + positive);
System.out.println("Unary Minus: " + negative);
```
