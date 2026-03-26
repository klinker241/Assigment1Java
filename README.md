# Assignment 1 - Recursion

## Student Information
Name: Muhammed Utemisov
Group: SE-2514

# Assignment 1 - Recursion

## Student Information
Name: YOUR NAME  
Group: YOUR GROUP  

---

## Task 1 - Print Digits
This function prints each digit of a number using recursion.

Example (n = 548):
digits(5481)
→ digits(548)
→ digits(54)
→ digits(5)
→ print 5
→ print 4
→ print 8

Output:
5
4
8
1

---

## Task 2 - Average of Elements
This function recursively calculates the sum of array elements.

Example:
Array: [3, 2, 4, 1]

sum(0)
→ 3 + sum(1)
→ 3 + 2 + sum(2)
→ 3 + 2 + 4 + sum(3)
→ 3 + 2 + 4 + 1 + sum(4)
→ 3 + 2 + 4 + 1 = 10

Average = 10 / 4 = 2,5

---

## Task 3 - Prime Number Check
This function checks if a number is prime.

Example (n = 7):
prime(7,2)
→ 7 % 2 ≠ 0
→ prime(7,3)
→ 7 % 3 ≠ 0
→ since 3*3 > 7 → Prime

Output:
Prime

---

## Task 4 - Factorial
This function calculates factorial using recursion.

Example (n = 4):
fact(4)
→ 4 * fact(3)
→ 4 * 3 * fact(2)
→ 4 * 3 * 2 * fact(1)
→ 4 * 3 * 2 * 1 = 24

Output:
24

---

## Task 5 - Fibonacci Number
This function finds the n-th Fibonacci number.

Example (n = 5):
fib(5)
→ fib(4) + fib(3)
→ (fib(3)+fib(2)) + (fib(2)+fib(1))
→ (2+1) + (1+1) = 5

Output:
5

---

## Task 6 - Power Function
This function calculates a^n recursively.

Example (2^3):
pow(2,3)
→ 2 * pow(2,2)
→ 2 * 2 * pow(2,1)
→ 2 * 2 * 2 * pow(2,0)
→ 2 * 2 * 2 * 1 = 8

Output:
8

---

## Task 7 - Reverse Output
This function prints numbers in reverse order.

Example:
Input: 1 4 6

rev(3)
→ read 1 → rev(2)
→ read 4 → rev(1)
→ read 6 → rev(0)
→ print 6
→ print 4
→ print 1

Output:
6 4 1

---

## Task 8 - Check Digits in String
This function checks if all characters are digits.

Example:
"123"
→ check '1'
→ check '2'
→ check '3'
→ all digits → Yes

"12a"
→ 'a' is not digit → No

---
## Task 9 - Count Characters
This function counts characters recursively.

Example ("abc"):
len("abc")
→ 1 + len("bc")
→ 1 + 1 + len("c")
→ 1 + 1 + 1 + len("")
→ 3

Output:
3

---

## Task 10 - GCD
This function finds GCD using Euclidean algorithm.

Example (32, 48):
gcd(32,48)
→ gcd(48,32)
→ gcd(32,16)
→ gcd(16,0)
→ 16

Output:
16

---
<img width="1852" height="1074" alt="image" src="https://github.com/user-attachments/assets/6dc7745c-ce79-4d50-ab97-83a081a681ef" />
<img width="1859" height="1089" alt="image" src="https://github.com/user-attachments/assets/b9df54e5-375b-47db-94a1-fd1e2082ffac" />
<img width="1865" height="1090" alt="image" src="https://github.com/user-attachments/assets/8af3b358-1b1d-49df-9866-35cf78a64a8e" />

## Summary
In this assignment, I used recursion to solve problems with numbers, arrays, and strings.
Each function has a base case and recursive step.
I understood how recursion simplifies problems by reducing them step by step.
