# Question No. 1
> Write a program to sum three numbers in Java.

# Question No. 2
> Write a program to calculate CGPA using marks of three subjects (out of 100).

# Question No. 3
> Write a Java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text.

# Question No. 4
> Write a Java program to convert Kilometers to miles.

# Question No. 5
> Write a Java program to detect whether a number entered by the user is integer or not.

# Question No. 6
Java has 8 primitive data types: char, boolean, byte, short, int, long, float, and double.
For this exercise, we will only work with the integer types:

byte → 8-bit signed integer
short → 16-bit signed integer
int → 32-bit signed integer
long → 64-bit signed integer

Given an input number, determine which of these primitive data types can safely store the value.
# Input Format
The first line contains an integer T, the number of test cases.
Each of the next T lines contains an integer n.
The value of n can be very large (beyond long).
# Output Format
For each test case:
Print the number followed by the message "can be fitted in:"
Then, print all applicable data types (each on a new line, prefixed with *) in increasing order of size.

f the number cannot fit into any of the four types, print:
n can't be fitted anywhere.

# Constraints
1 ≤ T ≤ 100
n may be smaller than -2^63 or larger than 2^63 - 1.

# Sample Input
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

# Sample Output
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long


