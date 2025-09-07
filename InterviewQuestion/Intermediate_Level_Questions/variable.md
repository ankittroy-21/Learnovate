# Java_Variable Interview Questions

## Intermediate-Level Questions 🧑‍💻

### Q1: What happens when you assign one variable to another for primitives vs. objects?
> Factual Answer:

For primitive types, assignment copies the value.

For reference types, assignment copies the reference, so both variables point to the same object.

>Crisp Analogy:

Primitives → Photocopying a document (you get a separate, independent copy).

Objects → Sharing a Google Doc link (everyone edits the same file).



### Q2: What's the key difference between a local variable and an instance variable?
> Factual Answer:

>Local variables:
Declared in a method
Method scope
Stored on the stack
Must be initialized manually

>Instance variables:
Declared in a class
Object scope
Stored on the heap
Given default values

>Crisp Analogy:

Local variable → Sticky note (temporary, thrown away after use)

Instance variable → Planner entry (part of your ongoing state)
---

### Q3: Why is no reference needed for a local variable?
> Factual Answer:

Local variables are stored directly on the stack frame

They can be accessed efficiently without a pointer

>Crisp Analogy:

You don't need a remote control for a glass of water that's right in front of you
---

### Q4:Describe the four JVM memory segments
> Factual Answer:

Code Segment → bytecode

Stack Segment → method calls & local variables

Heap Segment → objects

Static Segment → class-level data

>Crisp Analogy:

Think of a factory:

Code → architect's plans

Stack → workers' temporary workbenches

Heap → warehouse storage

Static → factory bulletin board
---

### Q5: What happens to an object with no reference?
> Factual Answer:

It becomes unreachable

Marked for garbage collection

Memory is freed

>Crisp Analogy:

Like a helium balloon you let go → gone forever, eventually cleaned up by the atmosphere
---

