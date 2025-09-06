# Two Dimensional Array

## Introduction to 2D Arrays


A two-dimensional array is essentially an array of arrays. Think of it like a grid or table with rows and columns, where each cell can store a value.

---

## Types of 2D Arrays

### 1. Rectangular 2D Arrays (same columns each row)
```java
int[][] mat = new int[3][4]; // 3 rows, 4 cols (all initialized to 0)
int[][] grid = { {1,2,3}, {4,5,6} }; // 2x3 literal initialization
```
### 2. Jagged 2D Arrays (different columns per row)
```java
int[][] jag = new int[3][];
jag[0] = new int[]{1,2};
jag[1] = new int[]{3,4,5};
jag[2] = new int[]{6};
```

### Important Notes:


- Java doesn't have "true" 2D arrays - they're arrays of references to arrays

- Memory efficiency varies between rectangular and jagged arrays

- Default values: 0 for integers, null for objects, false for booleans

---

## Iteration Patterns
### Index-based Iteration


> **When to use:** When you need index positions for calculations

> **Control:** Outer loop for rows, inner loop for columns

> **Access:** `array[row][column]` syntax
```java
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " ");
    }
    System.out.println();
}
```
### Enhanced for-loop Iteration


> **When to use:** When you only need values, not positions

> **Benefits:** Cleaner syntax, avoids index errors

> **Limitations:** Cannot modify array structure
```java
for (int[] row : grid) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}
```
---

## Common 2D Operations
### a) Row/Column Sums


> **Purpose:** Aggregate data along dimensions

> **Applications:** Statistics, matrix operations, data analysis

> **Edge Cases:** Handle empty rows/columns, null arrays
```java
// Calculate sum of a specific row
int rowSum(int[][] m, int r) {
    int sum = 0;
    for (int j = 0; j < m[r].length; j++) {
        sum += m[r][j];
    }
    return sum;
}

// Calculate sum of a specific column
int colSum(int[][] m, int c) {
    int sum = 0;
    for (int i = 0; i < m.length; i++) {
        sum += m[i][c];
    }
    return sum;
}
```
### b) Transpose (Square Matrix, In-place)


> **Square Matrix:** Can be done in-place to save memory

> **Rectangular Matrix:** Requires new array creation

> **Mathematical Property:** (Aᵀ)ᵀ = A
```java
void transposeSquare(int[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = i + 1; j < m[0].length; j++) {
            int t = m[i][j];
            m[i][j] = m[j][i];
            m[j][i] = t;
        }
    }
}
```
### c) Transpose (Rectangular, New Matrix)
```java
int[][] transpose(int[][] m) {
    int R = m.length, C = m[0].length;
    int[][] t = new int[C][R];
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            t[j][i] = m[i][j];
        }
    }
    return t;
}
```
### d) Matrix Addition (Same Dimensions)

> **Requirement:** Both matrices must have same dimensions

> **Element-wise Operation:** Each corresponding element added

> **Applications:** Linear algebra, image processing

```java
int[][] add(int[][] A, int[][] B) {
    int R = A.length, C = A[0].length;
    int[][] S = new int[R][C];
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            S[i][j] = A[i][j] + B[i][j];
        }
    }
    return S;
}
```

### e) Matrix Multiplication (A[r×k] * B[k×c])

> **Requirements:**

- `Columns of first matrix = Rows of second matrix`

- **Result dimensions:** Rows of first × Columns of second

> **Algorithm:** Triple nested loop implementation

> **Applications:** Transformations, graphics, scientific computing
```java
int[][] multiply(int[][] A, int[][] B) {
    int r = A.length, k = A[0].length, c = B[0].length;
    int[][] C = new int[r][c];
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            for (int t = 0; t < k; t++) {
                C[i][j] += A[i][t] * B[t][j];
            }
        }
    }
    return C;
}
```

## Helpful Utilities

- Arrays.deepToString():
> **Purpose:** Convert nested arrays to readable string

> **Advantage:** Handles any depth of nesting automatically

> **Output Format:** [[1, 2, 3], [4, 5, 6]]

- Arrays.deepEquals():
> **Purpose:** Compare two nested arrays for structural equality

> **Difference from `equals():`** Compares content, not references

> **Use Case:** Testing, validation, debugging 
```java
import java.util.Arrays;

// Print nested arrays
System.out.println(Arrays.deepToString(grid));

// Deep structural equality check
boolean eq = Arrays.deepEquals(A, B);
```
---

# Complexity Analysis

## Time Complexity Overview

| Operation | Complexity | Description |
|-----------|------------|-------------|
| **Access** | O(1) | Direct access with indices |
| **Traversal** | O(n×m) | Must visit each element |
| **Row Sum** | O(m) | m = number of columns |
| **Column Sum** | O(n) | n = number of rows |
| **Transposition** | O(n×m) | All elements must be moved |
| **Addition** | O(n×m) | Element-wise operation |
| **Multiplication** | O(n×m×p) | A[n×m] × B[m×p] = C[n×p] |

## Space Complexity

| Operation | Complexity | Notes |
|-----------|------------|-------|
| **Storage** | O(n×m) | Basic array storage |
| **Transposition** | O(n×m) | Creates new array |
| **Operations** | Typically O(n×m) | Additional space for results |

---

## Optimization Tips:
- Reuse arrays when possible to reduce memory allocation

- Consider algorithmic improvements for large matrices

- Use primitive types instead of objects for better performance

- Cache-friendly access patterns (row-major order)

## Real-World Considerations:
- For very large matrices, consider sparse matrix representations

- Parallel processing can improve performance for operations

- Memory constraints may affect maximum matrix size
