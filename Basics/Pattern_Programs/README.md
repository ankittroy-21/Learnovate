# Java Pattern Printing Programs

## Pattern 1: 4x4 Grid Pattern
### Pattern:
```text
# # # #
# # # #
# # # #
# # # #
```


### Java Code:
```java
public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(" # ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- This creates a 4x4 grid of hash symbols

- Outer loop runs 4 times (rows)

- Inner loop runs 4 times for each row (columns)

- Each iteration prints a hash symbol with spaces

## Pattern 2: Right-Angled Triangle Pattern
### Pattern:

```text
# 
#  #
#  #  #
#  #  #  #
#  #  #  #  #
```
### Java Code:

```java
public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" # ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- Creates a right-angled triangle pattern

- Outer loop controls the number of rows (5 rows)

- Inner loop runs from 0 to current row number (i)

- Each row has one more hash symbol than the previous row

## Pattern 3: Number Triangle Pattern
### Pattern:

```text
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```
### Java Code:

```java
public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- Prints numbers in a triangular pattern

- Outer loop runs from 1 to 5 (rows)

- Inner loop prints numbers from 1 to current row number

- Each row shows consecutive numbers starting from 1

## Pattern 4: Same Number Triangle Pattern
### Pattern:

```text
1 
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```
### Java Code:

```java
public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- Each row contains the same number repeated

- Outer loop variable (i) determines which number to print

- Inner loop prints the row number 'i' times

- Row 1: one '1', Row 2: two '2's, etc.

## Pattern 5: Inverted Right-Angled Triangle
### Pattern:

```text
*  *  *  *  * 
*  *  *  * 
*  *  * 
*  * 
*
```
### Java Code:

```java
public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- Creates an inverted right-angled triangle

- Outer loop runs 5 times (rows)

- Inner loop runs (5 - i) times, decreasing each row

- First row: 5 stars, Second row: 4 stars, etc.

## Pattern 6: Inverted Number Triangle
### Pattern:

```text
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
```
### Java Code:

```java
public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j < 5 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- Prints numbers in descending row length

- Outer loop controls the number of rows

- Inner loop prints numbers from 1 to (5 - i)

- Each row has one less number than previous row

## Pattern 7: Pyramid Pattern
### Pattern:

```text
    *    
   ***
  *****
 *******
*********
```
### Java Code:

```java
public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- Creates a pyramid pattern using spaces and stars

- First inner loop: prints leading spaces (decreases each row)

- Second inner loop: prints stars (increases by 2 each row)

- Third inner loop: prints trailing spaces (for symmetry)

## Pattern 8: Inverted Pyramid Pattern
### Pattern:

```text
********* 
 *******  
  *****   
   ***    
    *
```  
### Java Code:

```java
public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * 5 - 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
```
### Explanation:

- Creates an inverted pyramid pattern

- First inner loop: prints increasing spaces

- Second inner loop: prints decreasing stars

- Third inner loop: prints spaces for symmetry

- Star count decreases by 2 each row

## Pattern 9: Diamond Pattern
### Pattern:

```text
    *    
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```
### Java Code:

```java
public class Pattern9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * 5 - 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

```
### Efficient Way to do the above pattern
```java
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5; // height of half diamond

        for (int i = 0; i < 2 * n - 1; i++) {
            int spaces;
            int stars;

            if (i < n) { // upper half including middle row
                spaces = n - i - 1;
                stars = 2 * i + 1;
            } else {     // lower half
                spaces = i - n + 1;
                stars = 2 * (2 * n - i - 1) - 1;
            }

            // print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```
### Explanation:

- Combines both pyramid and inverted pyramid patterns

- First half: builds the upper pyramid (5 rows)

- Second half: builds the lower inverted pyramid (5 rows)

- Creates a perfect diamond shape

- Uses the same logic as Patterns 7 and 8 combined


## Pattern 10: Diamond Star Pattern
```text
*
*  *
*  *  *
*  *  *  *
*  *  *  *  *
*  *  *  *
*  *  *
*  *
*
```

```java
for (int i = 0; i <= 2*5-1; i++) {
    int stars = i;
    if (i > 5) stars = 2*5 - i;
    for (int j = 0; j < stars; j++) {
        System.out.print(" * ");
    }
    System.out.println("");
}
```
### Explanation:
- The outer loop runs from i = 0 to i = 9 (2*5-1 = 9)

- For the first half (i ≤ 5), the number of stars equals i

- For the second half (i > 5), the number of stars decreases as 2*5 - i

- This creates a diamond shape with increasing stars up to the middle row, then decreasing

## Pattern 11: Binary Triangle Pattern
```text
0 
1 0
0 1 0
1 0 1 0
1 0 1 0 1
```
```java
int start = 1;
for (int i = 0; i < 5; i++) {
    if (i % 2 == 0) start = 1;
    else start = 0;
    for (int j = 0; j < i; j++) {
        System.out.print(start + " ");
        start = 1 - start; // Toggles between 0 and 1
    }
    System.out.println("");
}
```
### Explanation:
- The outer loop controls the number of rows (5 rows)

- For even rows (i % 2 == 0), we start with 1

- For odd rows, we start with 0

- The inner loop toggles between 0 and 1 using start = 1 - start

- This creates an alternating binary pattern


