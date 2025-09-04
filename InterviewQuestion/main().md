# ☕ Java Core Concepts: Interview Questions

### A comprehensive guide to Java fundamentals, from beginner to expert level. Perfect for technical interview preparation.

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Contributions Welcome](https://img.shields.io/badge/Contributions-welcome-brightgreen.svg)
![Java Version](https://img.shields.io/badge/Java-8%2B-blue.svg)

---

## 🧭 Table of Contents
* [Beginner-Friendly Questions 🔰](#beginner-friendly-questions-)
* [Intermediate-Level Questions 🧑‍💻](#intermediate-level-questions-)
* [Expert-Level Questions 🚀](#expert-level-questions-)
* [Contributing](#contributing)
* [License](#license)

---

## Beginner-Friendly Questions 🔰

### Q1: Should a main() method be compulsorily declared in all java programs?
**A:** Yes. The main() method is the standard entry point for any standalone Java application. It's the method the Java Virtual Machine (JVM) looks for to begin executing your program.

### Q2: What is the return type of the main() method?
**A:** So that the main method becomes accessible to the JVM even without object creation. The JVM can invoke it directly without needing to create an instance of the class that contains it.

### Q3: Why is the main() method declared static?
**A:**  So that the main method becomes accessible to the JVM even without object creation. The JVM can invoke it directly without needing to create an instance of the class that contains it.

### Q4:What is the argument of main() method?
**A:**String args[] which is a variable sized array (dynamic array) that is used to collect command line arguments when the program is executed.

### Q5:Does the order of public and static declaration matter in main() method?
**A:** No. The order of the modifiers public and static is interchangeable. Both public static void main(String[] args) and static public void main(String[] args) are valid.


### Q6:  What is meant by orientation?
> Orientation refers to Perspective (or) Point of view (or) the way we look at things. In programming, it often relates to different approaches like object-oriented programming.

---

### Q7: Why should we enclose main() method within a class?
>An error message would be displayed as "Main method not found error" because the JVM, which is external to your class, would not have access to the main() method.
---

### Q8:What happens if we do not declare main() as public?
> n error message would be displayed as "Main method not found error" because the JVM, which is external to your class, would not have access to the main() method.

---

### Q9:  What happens if we do not declare main() as static?
>An error message would be displayed as "Main method is not static error" because the JVM would be unable to call the method without an object instance.
---

### Q10: Which command in java is used to invoke the java compiler?
> javac command is used to invoke the Java compiler. For example, javac MyProgram.java compiles the source file into a .class file.



## Intermediate-Level Questions 🧑‍💻



## Expert-Level Questions 🚀


## Contributing
Feel free to contribute by submitting pull requests or opening issues for suggestions and corrections.

## License
This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).

---

### Happy Learning! 🎉
