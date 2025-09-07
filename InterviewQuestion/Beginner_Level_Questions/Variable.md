# ☕ Java Core Concepts: Interview Questions - Variables

## Beginner-Friendly Questions 🔰

### Q1: What is an object also called as?
**A:** Object is also called as Instance.

### Q2: What is the default name of the object?
**A:**No default name is associated with an object.

### Q3: How do we access an object?
**A:** Through a reference or handle.

### Q4: Why do we require a reference variable?
**A:** To access the has part (attributes) and does part (methods) of an object.

### Q5: What are the contents of an object also called as?
**A:** Instance variables.

### Q6: What is a reference variable also called as?
> Handle.
---

### Q7: Who allocates memory for the object?
> JVM (Java Virtual Machine).

---

### Q8: Where is memory for the object allocated? Why?
>  Memory for an object is allocated on the Heap segment so that the garbage collector can de-allocate memory of an object when it's no longer needed.
---

### Q9: When is memory for an object allocated?
> When the new keyword is executed, object memory is allocated on the Heap segment.
---

### Q10: When is memory for an object de-allocated?
>Whenever there is no reference referring to an object, it becomes garbage and the garbage collector de-allocates its memory.
---

### Q11:What are the different types of segments on the RAM?
> There are four segments: Code segment, Stack segment, Static segment, and Heap segment.

---

### Q12: Who allocates memory for the reference variables?
> JVM.

---

### 13: Where is memory for reference variable allocated? Why?
> Memory for reference variables is created in the stack segment inside the activation record. This allows efficient access to objects stored in the heap segment.
---

### Q14: When is memory for reference variable allocated?
> When the control enters into the method.

---
### Q15: When is memory for a reference variable deallocated?
> When the control leaves the method.
---
