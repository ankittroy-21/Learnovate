# Java Interview Questions

## Intermediate-Level Questions 🧑‍💻

### Q1: How does Java's two-step execution model achieve both portability and security?
> It achieves both through the use of **bytecode**:
>
> - **Portability**: The compiler produces universal bytecode that is not specific to any machine. This single artifact can be sent to any device with a compatible JVM, which then handles the final translation to native code. This is the **"Write Once, Run Anywhere"** principle.
>
> - **Security**: Before the JVM interprets or compiles the bytecode, it is first handed to the **Bytecode Verifier**. This "security guard" analyzes the bytecode to ensure it doesn't perform illegal operations like accessing private memory or violating type rules. This verification step provides a strong security sandbox, which is difficult to implement in languages that compile directly to machine code.

### Q2: Explain the difference between a `StackOverflowError` and an `OutOfMemoryError`.
> Both are critical errors related to memory, but they happen in different parts of the JVM's memory:
>
> - **`StackOverflowError`**: This occurs in the **Stack Memory**. Each thread has its own stack, which stores information about method calls. If a method calls itself recursively without a proper exit condition, it fills up the stack with new frames until it runs out of space, causing this error.
>
> - **`OutOfMemoryError`**: This occurs in the **Heap Memory**. The heap is where all Java objects are stored. This error happens when the application tries to create a new object, but there isn't enough space left in the heap, and the Garbage Collector cannot free up any more.
>
> ```mermaid
> graph LR
>     A[Memory Error] --> B[StackOverflowError];
>     A --> C[OutOfMemoryError];
>     B --> D[Stack Memory];
>     C --> E[Heap Memory];
>     D --> F[Recursive method calls];
>     E --> G[Excessive object creation];
> ```

### Q3: Why are Strings immutable in Java? Discuss one benefit.
> A `String` object is **immutable**, meaning once it is created, its value cannot be changed. Any operation that appears to modify a `String` (like concatenation) actually creates a new `String` object.
>
> One key benefit is **security**. Many parts of a Java application rely on `String` values for parameters, such as file paths, network connections, and security credentials. If Strings were mutable, a malicious piece of code could change the value of a `String` after it has been checked for security, potentially redirecting a file operation or database query to an unauthorized target. Immutability prevents this entire class of vulnerabilities.

### Q4: What is garbage collection and why is it necessary in Java?
> **Garbage Collection (GC)** is the process by which the JVM **automatically reclaims memory** occupied by objects that are no longer in use by the application. It's necessary because it frees developers from the burden of manual memory management. In languages like C++, developers must explicitly allocate and deallocate memory. Forgetting to deallocate memory leads to **"memory leaks,"** where the application's memory usage grows indefinitely until it crashes. Java's automatic GC prevents most memory leaks and makes programs safer and easier to write.

### Q5: Explain the difference between method overloading and method overriding.
> Both are forms of polymorphism, but they are fundamentally different:
>
> - **Method Overloading (Compile-time Polymorphism)**: This is when two or more methods within the **same class** share the same name but have **different parameter lists** (either a different number of parameters or different types). The correct method to call is determined by the compiler based on the arguments passed.
>
> - **Method Overriding (Runtime Polymorphism)**: This is when a method in a **subclass** has the **same name, return type, and parameters** as a method in its superclass. The subclass provides a specific implementation for the method. The correct method to call is determined at runtime based on the actual object type.

### Q6: What is the difference between an interface and an abstract class?
> - **Abstract Class**: Can have both abstract methods (without a body) and concrete methods (with a body). A class can only **extend one abstract class**. It represents an **"is-a" relationship** with a focus on shared implementation.
>
> - **Interface**: Traditionally could only have abstract methods (Java 8+ allows default and static methods). A class can **implement multiple interfaces**. It represents a **"can-do" relationship**, defining a contract of capabilities without dictating implementation.
>
> You would choose an abstract class when you want to provide a base implementation that subclasses can share, and an interface when you want to define a contract that unrelated classes can adopt.

### Q7: What is the purpose of the `static` keyword?
> The `static` keyword means a variable or method belongs to the **class itself**, not to any specific instance (object) of that class.
>
> - **`static` Variable**: There is only **one copy** of this variable, shared among all objects of the class.
>
> - **`static` Method**: Can be called directly on the class name **without creating an object**. It cannot use non-static (instance) variables or methods because it isn't associated with a specific object.

### Q8: How does the Just-In-Time (JIT) compiler improve performance?
> A Java program starts by having the JVM interpret the bytecode, which is relatively slow. The **JIT compiler** monitors the code as it runs to identify **"hotspots"**—methods that are executed frequently. It then takes these hotspots and compiles them into highly optimized **native machine code**. The next time that method is called, the JVM executes the fast, compiled version directly instead of interpreting it again. This gives Java performance that can approach that of natively compiled languages like C++.

### Q9: What is the difference between an object file and an executable file?
> In a language like C:
>
> - **Object File (`.o`)**: This is the output of the compiler for a single source file. It contains machine code but is **incomplete**. It may have unresolved references to functions or variables defined in other files or libraries. It is **not executable**.
>
> - **Executable File**: This is the output of the **linker**. The linker takes one or more object files, combines them with the necessary code from libraries, resolves all references, and produces a **complete, standalone program** that the OS can run.

### Q10: Why is the `main` method in Java declared as `public static void`?
> - **`public`**: So it can be accessed by the JVM to start the program. If it were `private`, the JVM couldn't call it.
> - **`static`**: So the JVM can call it without having to create an object of the class first. The `main` method is the entry point, before any objects have been created.
> - **`void`**: Because it does not return any value to the JVM. Its purpose is to start the execution.

---
