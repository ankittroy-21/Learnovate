# Type Casting in Java
### What is Type Casting?
Type Casting in Java is the process of converting the value of one data type into another.
Since Java is a strongly-typed language, every variable and expression has a specific type,
and type conversion must be handled properly — either automatically by the compiler or
manually by the programmer.
### Why Do We Need Type Casting?
- To perform operations between different data types (e.g., int + double)
- To match method parameter types in method overloading
- To handle legacy APIs or libraries that return broader data types
- To optimise memory (e.g., store a double as int if precision isn’t needed)

### Types of Type Casting in Java
## 1. Widening Type Casting (Implicit/Automatic)
 Definition:


Widening casting happens automatically when a value of a smaller data type is assigned to a
larger data type.
#### Why it's allowed:
- No risk of data loss
- The range of the larger type fully contains the range of the smaller type
#### Example:
```java
int a = 50;
double b = a; // implicit conversion from int to double
```
#### Internally:
- JVM promotes int (4 bytes) to double (8 bytes) by filling up the extra space with zeroes
after the decimal point.
- The variable b becomes 50.0.
## Data Conversion Hierarchy:

```
byte → short → int → long → float → double
        ↑
       char
```
#### Real-Life Analogy:
- Pouring water from a small glass into a bucket – no spillage, easy conversion.


## 2. Narrowing Type Casting (Explicit/Manual)
#### Definition:
Narrowing casting must be explicitly specified when converting a larger data type to a
smaller data type.


#### Why it's restricted:
- There is potential data loss
- Precision might be lost (e.g., decimal values), or values may overflow
#### Example:
```java
double price = 99.99;
int rounded = (int) price; // manual conversion, decimal truncated
```
#### Internally:
- JVM truncates the fractional part without rounding
- Only the integer part is retained → 99

#### Another Example (with overflow):
```java
int num = 130;
byte b = (byte) num; // byte range is -128 to 127
System.out.println(b); // Output: -126
```
- Since 130 exceeds the byte range, it wraps around (overflows).
#### Real-Life Analogy:
- Pouring water from a bucket into a small cup – some water will spill.

### Behind the Scenes (How JVM Handles Casting)
- Widening is straightforward – the compiler generates bytecode to widen the type
safely.
- Narrowing uses casting operators that tell the compiler, "I know this might lose data, but
I want to do it."

### Type Promotion in Expressions
When you perform operations between mixed types, Java promotes smaller types
automatically:
```java
int x = 5;
float y = 2.5f;
float result = x + y; // x is promoted to float, result = 7.5
```
#### Rule:
- byte, short, char → promoted to int in expressions
- Result will be the largest type involved

## Summary Table


| Aspect | Widening | Narrowing |
|---|---|---|
| `Performed By` | Compiler (automatic) | Programmer (manual) |
| `Risk` | Safe Risky | (data loss) |
| `Syntax` | No casting needed | Requires (type) casting |
| `Use Case` | Assigning small to large type | Assigning large to small type |
| `Example` | int → double | double → int |

#### Conclusion:
Type Casting helps in writing flexible, memory-efficient, and interoperable Java code.
Widening makes code safer and simpler, while narrowing requires awareness of potential
data loss.
