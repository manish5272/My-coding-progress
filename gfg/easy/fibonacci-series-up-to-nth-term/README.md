# First n Fibonacci using DP

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer  **n**, return the fibonacci series till the nth(0-based indexing) term. Since the terms can become very large return the terms modulo 109+7.

 **Examples:** 

```
Input: n = 5
Output: [0, 1, 1, 2, 3, 5]
```

```
Input: n = 10
Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
```

 **Constraint:** 
1 ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T23:54:16.151Z  

```java
class Solution {
    ArrayList<Integer> fibonacciNumbers(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        int mod = 1000000007;

        int first = 0;
        int second = 1;

        list.add(first);

        if (n >= 1) {
            list.add(second);
        }

        for (int i = 2; i <= n; i++) {

            int third = (first + second) % mod;

            list.add(third);

            first = second;
            second = third;
        }

        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1)