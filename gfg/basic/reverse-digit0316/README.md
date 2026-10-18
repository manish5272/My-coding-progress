# Reverse Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an integer  **n.** Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

 **Examples:** 

```
Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

```

```
Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.
```

```
Input : n = 12345 
Output: 54321
Explanation: By reversing the digits of number, number will change into 54321.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:51:07.603Z  

```java
class Solution {
    public int reverseDigits(int n) {
        int lastdigit;
        int reverse=0;
        
        while(n>0){
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
    
        }
        return reverse;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-digit0316/1)