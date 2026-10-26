# Sum of Primes Between Number and Its Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n`.

Let `r` be the integer formed by reversing the digits of `n`.

Return the  **sum**  of all prime numbers between `min(n, r)` and `max(n, r)`, inclusive.

 

 **Example 1:** 

 **Input:**  n = 13

 **Output:**  132

 **Explanation:** 

- The reverse of 13 is 31. Thus, the range is [13, 31].
- The prime numbers in this range are 13, 17, 19, 23, 29, and 31.
- The sum of these prime numbers is 13 + 17 + 19 + 23 + 29 + 31 = 132.

 **Example 2:** 

 **Input:**  n = 10

 **Output:**  17

 **Explanation:** 

- The reverse of 10 is 1. Thus, the range is [1, 10].
- The prime numbers in this range are 2, 3, 5, and 7.
- The sum of these prime numbers is 2 + 3 + 5 + 7 = 17.

 **Example 3:** 

 **Input:**  n = 8

 **Output:**  0

 **Explanation:** 

- The reverse of 8 is 8. Thus, the range is [8, 8].
- There are no prime numbers in this range, so the sum is 0.

 

 **Constraints:** 

- 1 <= n <= 1000

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 29.71%)  
**Memory:** 42.6 MB (beats 48.95%)  
**Submitted:** 2026-10-26T21:40:55.562Z  

```java
class Solution {
    public int sumOfPrimesInRange(int n) {
        int nr=n;
        int r=0;
        
        while(nr!=0){
            int lastdigit=nr%10;
            r = r *10 +lastdigit;
            nr = nr / 10;
        }

        int start=Math.min(n,r);
        int end=Math.max(n,r);

        int sum=0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                sum=sum+i;
            }
        }

        
        return sum;
    }


    private boolean isPrime(int n){

            if(n<=1){
                return false;
            }

            for(int i=2;i<=n/i;i++){

                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/)