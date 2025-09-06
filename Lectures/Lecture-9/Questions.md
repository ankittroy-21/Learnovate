# Question No. 1
> Given a 2D array `int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`, implement a function to traverse the matrix in row-major order and return all elements in a single list.

**Input:** `matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`  
**Output:** `[1, 2, 3, 4, 5, 6, 7, 8, 9]`  
**Explanation:** Traverse row by row, left to right

---

# Question No. 2
> Given a 2D array `int[][] grid = {{1, 2}, {3, 4}, {5, 6}}`, implement a function to calculate both row sums and column sums.

**Input:** `grid = {{1, 2}, {3, 4}, {5, 6}}`  
**Output:** `Row sums: [3, 7, 11], Column sums: [9, 12]`  
**Explanation:** 
- Row 0: 1+2=3, Row 1: 3+4=7, Row 2: 5+6=11
- Column 0: 1+3+5=9, Column 1: 2+4+6=12

---

# Question No. 3
> Given a square matrix `int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`, implement an in-place transposition function.

**Input:** `matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`  
**Output:** `{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}`  
**Explanation:** Swap elements across the main diagonal without using extra space

---

# Question No. 4
> Given a rectangular matrix `int[][] matrix = {{1, 2, 3}, {4, 5, 6}}`, create and return its transpose without modifying the original.

**Input:** `matrix = {{1, 2, 3}, {4, 5, 6}}`  
**Output:** `{{1, 4}, {2, 5}, {3, 6}}`  
**Explanation:** Create a new matrix with swapped dimensions

---

# Question No. 5
> Given two matrices `int[][] A = {{1, 2}, {3, 4}}` and `int[][] B = {{5, 6}, {7, 8}}`, implement matrix addition with proper error handling.

**Input:** `A = {{1, 2}, {3, 4}}`, `B = {{5, 6}, {7, 8}}`  
**Output:** `{{6, 8}, {10, 12}}`  
**Explanation:** Check if dimensions match before performing element-wise addition

---

# Question No. 6
> Given two matrices `int[][] A = {{1, 2, 3}, {4, 5, 6}}` and `int[][] B = {{7, 8}, {9, 10}, {11, 12}}`, implement matrix multiplication.

**Input:** `A = {{1, 2, 3}, {4, 5, 6}}`, `B = {{7, 8}, {9, 10}, {11, 12}}`  
**Output:** `{{58, 64}, {139, 154}}`  
**Explanation:** Verify that columns of A match rows of B before multiplication

---

# Question No. 7
> Given a jagged array `int[][] jagged = {{1, 2}, {3, 4, 5}, {6}}`, find the row with maximum elements and the row with minimum elements.

**Input:** `jagged = {{1, 2}, {3, 4, 5}, {6}}`  
**Output:** `Max row: 1 (3 elements), Min row: 2 (1 element)`  
**Explanation:** Handle variable row lengths in jagged arrays

---

# Question No. 8
> Given a 2D array `int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`, implement both main diagonal and anti-diagonal sum functions.

**Input:** `matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`  
**Output:** `Main diagonal: 15, Anti-diagonal: 15`  
**Explanation:** 
- Main diagonal: [0,0], [1,1], [2,2] → 1+5+9=15
- Anti-diagonal: [0,2], [1,1], [2,0] → 3+5+7=15

---

# Question No. 9
> Given a 2D array `int[][] matrix = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}}`, implement a function to count specific elements (e.g., count all zeros).

**Input:** `matrix = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}}`  
**Output:** `Zeros count: 4`  
**Explanation:** Traverse entire matrix and count occurrences of target value

---

# Question No. 10
> Given a 2D array `int[][] matrix = {{1, 2}, {3, 4}}`, check if the matrix is symmetric (matrix equals its transpose).

**Input:** `matrix = {{1, 2}, {3, 4}}`  
**Output:** `false`  
**Explanation:** Compare original matrix with its transpose element by element

---

# Question No. 11
> Given a 2D array `int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}`, implement the "Set Matrix Zeroes" algorithm in-place.

**Input:** `matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}`  
**Output:** `{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}`  
**Explanation:** Use efficient space complexity approach (O(1) space)

---

# Question No. 12
> Given a 2x2 matrix `int[][] matrix = {{a, b}, {c, d}}`, implement a function to calculate its determinant.

**Input:** `matrix = {{1, 2}, {3, 4}}`  
**Output:** `-2`  
**Explanation:** determinant = (a*d) - (b*c) = (1*4) - (2*3) = -2

---

# Question No. 13
> Given a 2D array `int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`, implement a function to rotate the matrix 90 degrees clockwise.

**Input:** `matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}`  
**Output:** `{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}`  
**Explanation:** Use layer-by-layer rotation approach

---

# Question No. 14
> Given a 2D array `int[][] matrix`, implement a function to find the maximum element and its position (row, column).

**Input:** `matrix = {{1, 5, 3}, {9, 2, 8}, {4, 7, 6}}`  
**Output:** `Maximum: 9 at position (1, 0)`  
**Explanation:** Traverse and compare all elements while tracking position

---

# Question No. 15
> Given a 2D array `int[][] matrix`, implement a function to calculate the sum of all elements using both nested loops and enhanced for loops.

**Input:** `matrix = {{1, 2}, {3, 4}}`  
**Output:** `10`  
**Explanation:** Demonstrate two different iteration approaches for the same result
