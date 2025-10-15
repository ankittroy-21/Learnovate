# Question No. 1
> What will be the output of the following code and why?

```java
String s = null;
System.out.println(s.length());
```
# Question No. 2
> Identify the type of exception that will be thrown in each case:

- `int a` = `10/0`;

- `int[] arr` = `new` `int[5]`; `arr[10]` = `5`;

- `Integer.parseInt("abc")`;

- `String str` = `null`; `str.toUpperCase()`;

# Question No. 3
> Write a Java program that creates a custom exception InvalidAgeException and a method validateVoter(int age) that throws this exception when age is less than 18.

# Question No. 4
> Explain the difference between checked and unchecked exceptions with examples. Why do we need custom exceptions?

# Question No. 5
> What will be the output of this code and explain the execution flow:

```java
try {
    int result = 10 / 0;
    System.out.println("Result: " + result);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error occurred");
} catch (Exception e) {
    System.out.println("General error occurred");
} finally {
    System.out.println("Finally block executed");
}
```
# Question No. 6
> Write a Java program that demonstrates multiple catch blocks handling different exceptions in a single try block.

# Question No. 7
> Create a custom exception NegativeSalaryException and write a method calculateTax(double salary) that throws this exception when salary is negative.

# Question No. 8
> What is the problem with this exception handling code and how would you fix it?

```java
try {
    // some code
} catch (Exception e) {
    System.out.println("Error occurred");
} catch (ArithmeticException e) {
    System.out.println("Math error");
}
```
# Question No. 9
> Write a program that uses try-catch-finally block to handle ArrayIndexOutOfBoundsException and ensures a message is printed regardless of whether exception occurs or not.

# Question No. 10
> Explain the concept of exception propagation in Java with a suitable example. What happens when an exception is not caught in a method?
