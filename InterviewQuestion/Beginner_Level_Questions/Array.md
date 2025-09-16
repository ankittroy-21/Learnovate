# Java Arrays Interview Questions

## Basic Concepts

### Q1: When should an array data structure be used?
**A:** Array data structure should be used when numerous data of the same type has to be stored.

### Q2: What is an advantage of an array data structure?
**A:**
- Creation of an array is simple
- Inserting data into an array using loops is simple
- Extracting data from the array using loops is simple

### Q3: What is the disadvantage of an array data structure?
**A:**
- Arrays can store only homogeneous data
- The size of an array is fixed throughout program execution
- Arrays demand contiguous memory locations on the RAM

### Q4: Who creates arrays in Java and where?
**A:** JVM creates array on the heap segment.

### Q5: What are the different types of arrays in Java?
**A:** 1-D, 2-D, 3-D and Multi-Dimensional Regular and jagged array.

## Q6: Design an array for marks of 100 students
**A:** int a[] = new int[100];

## Q7: Design an array for marks of students in 5 classes each with 100 students
**A:** int a[][] = new int[5][100];

## Q8: Design an array for marks of students in 3 schools each with 5 classes each with 100 students
**A:** int a[][][] = new int[3][5][100];

## Q9: What is the advantage of jagged array data structure?
**A:**  In real life, data is often irregular. Jagged arrays provide a solution for storing irregular data structures.

## Q9:What are the exceptions associated with arrays?
**A:** ArrayIndexOutOfBoundsException, NegativeArraySizeException, and ArrayStoreException.