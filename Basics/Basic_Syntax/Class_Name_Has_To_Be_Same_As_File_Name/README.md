# Why does my Java file name have to match my class name? 📝
Java enforces a strict rule: the name of a public class must exactly match the name of the .java file it is in.

> For example, if you have public class MyFirstApp, the file must be saved as MyFirstApp.java.

## Why? 
This helps the compiler and JVM find your code easily. It creates a simple, predictable organization system. It's also case-sensitive, so myfirstapp.java would not work.

```java

// This code MUST be in a file named "HelloWorld.java"
public class HelloWorld {
    // ...
}
``
